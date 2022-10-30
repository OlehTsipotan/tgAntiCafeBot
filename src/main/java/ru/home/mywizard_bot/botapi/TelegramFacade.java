package ru.home.mywizard_bot.botapi;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.home.mywizard_bot.MyWizardTelegramBot;
import ru.home.mywizard_bot.service.LocaleMessageService;
import ru.home.mywizard_bot.service.MainMenuService;
import ru.home.mywizard_bot.service.OrderMenuService;

@Component
@Slf4j
public class TelegramFacade {
    private MainMenuService mainMenuService;
    private OrderMenuService orderMenuService;
    private MyWizardTelegramBot myWizardBot;
    private LocaleMessageService localeMessageService;

    public TelegramFacade(MainMenuService mainMenuService, OrderMenuService orderMenuService, @Lazy MyWizardTelegramBot myWizardTelegramBot, LocaleMessageService localeMessageService) {
        this.orderMenuService = orderMenuService;
        this.mainMenuService = mainMenuService;
        this.myWizardBot = myWizardTelegramBot;
        this.localeMessageService = localeMessageService;
    }

    public BotApiMethod<?> handleUpdate(Update update) {
        BotApiMethod<?> replyMessage = null;

        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            log.info("New callbackQuery from User: {}, userId: {}, with data: {}", update.getCallbackQuery().getFrom().getUserName(),
                    callbackQuery.getFrom().getId(), update.getCallbackQuery().getData());
            return processCallbackQuery(callbackQuery);
        }


        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            log.info("New message from User:{}, userId: {}, chatId: {},  with text: {}",
                    message.getFrom().getUserName(), message.getFrom().getId(), message.getChatId(), message.getText());
            replyMessage = handleInputMessage(message);
        }

        return replyMessage;
    }

    private BotApiMethod<?> handleInputMessage(Message message) {
        String inputMsg = message.getText();
        Long chatId = message.getChatId();
        SendMessage replyMessage = new SendMessage();
        System.out.println(inputMsg);
        if (inputMsg.equals("/start")){
            myWizardBot.sendPhoto(chatId, localeMessageService.getMessage("msg.start"), "static/images/start_image.jpg", mainMenuService.getMainMenuKeyboard());
//            replyMessage.setChatId(String.valueOf(chatId));
//            replyMessage.setText(localeMessageService.getMessage("msg.start"));
        } else if (inputMsg.equals(localeMessageService.getMessage("btn.order"))){
            myWizardBot.sendPhoto(chatId, localeMessageService.getMessage("msg.order"), "static/images/start_image.jpg", orderMenuService.getOrderMenuInlineKeyboard());
        } else if (inputMsg.equals(localeMessageService.getMessage("btn.about"))) {
            replyMessage = new SendMessage(String.valueOf(chatId)
                    , localeMessageService.getMessage("msg.about"));
            System.out.println(localeMessageService.getMessage("msg.about"));
        } else if (inputMsg.equals(localeMessageService.getMessage("btn.addresses"))) {
            replyMessage = new SendMessage(String.valueOf(chatId), localeMessageService.getMessage("msg.addresses"));
        }

        return replyMessage;
    }

    @SneakyThrows
    private BotApiMethod<?> processCallbackQuery(CallbackQuery buttonQuery) {
        int pageNumber = 1;
        final long chatId = buttonQuery.getMessage().getChatId();
        final long userId = buttonQuery.getFrom().getId();
        final Integer messageId = buttonQuery.getMessage().getMessageId();
        EditMessageCaption callBackMessage = new EditMessageCaption();
        AnswerCallbackQuery callBackAnswer = new AnswerCallbackQuery();
        System.out.println(buttonQuery.getData());

        if (buttonQuery.getData().contains("CallBackAddress")){
            callBackMessage.setChatId(String.valueOf(chatId));
            callBackMessage.setCaption(localeMessageService.getMessage("msg.chooseTheRoom"));
            callBackMessage.setMessageId(messageId);
            switch (buttonQuery.getData()){
                case "CallBackAddress1":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress1Keyboard(1));
                    break;
                case "CallBackAddress2":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress2Keyboard(1));
                    break;
                case "CallBackAddress3":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress3Keyboard(1));
                    break;
                case "CallBackAddress4":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress4Keyboard(1));
                    break;
                case "CallBackAddress5":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress5Keyboard(1));
                    break;
            }
            myWizardBot.execute(callBackMessage);
        } else if (buttonQuery.getData().equals("ChooseAddress")){
            callBackMessage.setChatId(String.valueOf(chatId));
            callBackMessage.setCaption(localeMessageService.getMessage("msg.order"));
            callBackMessage.setMessageId(messageId);
            callBackMessage.setReplyMarkup(orderMenuService.getOrderMenuInlineKeyboard());
            myWizardBot.execute(callBackMessage);
        } else if (buttonQuery.getData().contains("Button")) {
            callBackMessage.setChatId(String.valueOf(chatId));
            callBackMessage.setCaption(localeMessageService.getMessage("msg.chooseTheRoom"));
            callBackMessage.setMessageId(messageId);

            if (buttonQuery.getData().contains("Next")){
                System.out.println("NEXT");
                pageNumber = Integer.parseInt(buttonQuery.getData().split("-")[1]) + 1;
            } else if (buttonQuery.getData().contains("Prev")) {
                System.out.println("PREV");
                pageNumber = Integer.parseInt(buttonQuery.getData().split("-")[1]) - 1;
            }
            System.out.println(buttonQuery.getData().split("-")[3]);
            switch (buttonQuery.getData().split("-")[3]){
                case "1":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress1Keyboard(pageNumber));
                    break;
                case "2":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress2Keyboard(pageNumber));
                    break;
                case "3":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress3Keyboard(pageNumber));
                    break;
                case "4":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress4Keyboard(pageNumber));
                    break;
                case "5":
                    callBackMessage.setReplyMarkup(orderMenuService.getAddress5Keyboard(pageNumber));
                    break;
            }
            myWizardBot.execute(callBackMessage);
        } else if (buttonQuery.getData().contains("more")) {
            myWizardBot.sendPhoto(chatId, localeMessageService.getMessage("msg." + buttonQuery.getData()), "static/images/rooms/"+ buttonQuery.getData().split("_")[0]+".jpg", orderMenuService.getRoomInfoFinal());
        } else if (buttonQuery.getData().contains("room")) {
            myWizardBot.sendPhoto(chatId, localeMessageService.getMessage("msg." + buttonQuery.getData()), "static/images/rooms/"+buttonQuery.getData()+".jpg", orderMenuService.getRoomInfo(buttonQuery.getData()));
        } else if (buttonQuery.getData().equals("deleteMsg")) {
            DeleteMessage deleteMessage = new DeleteMessage();
            deleteMessage.setChatId(String.valueOf(chatId));
            deleteMessage.setMessageId(messageId);
            myWizardBot.execute(deleteMessage);
        }
        callBackAnswer.setCallbackQueryId(buttonQuery.getId());
        return callBackAnswer;
    }
}
