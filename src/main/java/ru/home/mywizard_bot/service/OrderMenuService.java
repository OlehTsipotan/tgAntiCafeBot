package ru.home.mywizard_bot.service;

import org.apache.tomcat.util.threads.InlineExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderMenuService {

    @Autowired
    private LocaleMessageService localeMessageService;

    public InlineKeyboardMarkup getOrderMenuInlineKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonAddress1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonAddress2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonAddress3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonAddress4 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonAddress5 = new InlineKeyboardButton();

        inlineKeyboardButtonAddress1.setText(localeMessageService.getMessage("btn.address1"));
        inlineKeyboardButtonAddress2.setText(localeMessageService.getMessage("btn.address2"));
        inlineKeyboardButtonAddress3.setText(localeMessageService.getMessage("btn.address3"));
        inlineKeyboardButtonAddress4.setText(localeMessageService.getMessage("btn.address4"));
        inlineKeyboardButtonAddress5.setText(localeMessageService.getMessage("btn.address5"));

        inlineKeyboardButtonAddress1.setCallbackData("CallBackAddress1");
        inlineKeyboardButtonAddress2.setCallbackData("CallBackAddress2");
        inlineKeyboardButtonAddress3.setCallbackData("CallBackAddress3");
        inlineKeyboardButtonAddress4.setCallbackData("CallBackAddress4");
        inlineKeyboardButtonAddress5.setCallbackData("CallBackAddress5");

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow5 = new ArrayList<>();
        keyboardButtonsRow1.add(inlineKeyboardButtonAddress1);
        keyboardButtonsRow2.add(inlineKeyboardButtonAddress2);
        keyboardButtonsRow3.add(inlineKeyboardButtonAddress3);
        keyboardButtonsRow4.add(inlineKeyboardButtonAddress4);
        keyboardButtonsRow5.add(inlineKeyboardButtonAddress5);
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);
        rowList.add(keyboardButtonsRow4);
        rowList.add(keyboardButtonsRow5);

        inlineKeyboardMarkup.setKeyboard(rowList);


        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getAddress1Keyboard(int pageNumber){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonRoom1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom4 = new InlineKeyboardButton();

        InlineKeyboardButton inlineKeyboardButtonNext = new InlineKeyboardButton();
        inlineKeyboardButtonNext.setText("➡️");
        inlineKeyboardButtonNext.setCallbackData("ButtonNext-" + pageNumber + "-Address-1");
        InlineKeyboardButton inlineKeyboardButtonPrev = new InlineKeyboardButton();
        inlineKeyboardButtonPrev.setText("⬅️️");
        inlineKeyboardButtonPrev.setCallbackData("ButtonPrev-" + pageNumber + "-Address-1");
        InlineKeyboardButton inlineKeyboardButtonChooseAddress = new InlineKeyboardButton();

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow6 = new ArrayList<>();

        switch (pageNumber){
            case 1:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address1room1"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address1room2"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address1room3"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address1room4"));
                inlineKeyboardButtonRoom1.setCallbackData("address1room1");
                inlineKeyboardButtonRoom2.setCallbackData("address1room2");
                inlineKeyboardButtonRoom3.setCallbackData("address1room3");
                inlineKeyboardButtonRoom4.setCallbackData("address1room4");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 2:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address1room5"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address1room6"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address1room7"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address1room8"));
                inlineKeyboardButtonRoom1.setCallbackData("address1room5");
                inlineKeyboardButtonRoom2.setCallbackData("address1room6");
                inlineKeyboardButtonRoom3.setCallbackData("address1room7");
                inlineKeyboardButtonRoom4.setCallbackData("address1room8");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 3:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address1room9"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address1room10"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address1room11"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address1room12"));
                inlineKeyboardButtonRoom1.setCallbackData("address1room9");
                inlineKeyboardButtonRoom2.setCallbackData("address1room10");
                inlineKeyboardButtonRoom3.setCallbackData("address1room11");
                inlineKeyboardButtonRoom4.setCallbackData("address1room12");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 4:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address1room13"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address1room14"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address1room15"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address1room16"));
                inlineKeyboardButtonRoom1.setCallbackData("address1room13");
                inlineKeyboardButtonRoom2.setCallbackData("address1room14");
                inlineKeyboardButtonRoom3.setCallbackData("address1room15");
                inlineKeyboardButtonRoom4.setCallbackData("address1room16");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 5:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address1room17"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address1room18"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address1room19"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address1room20"));
                inlineKeyboardButtonRoom1.setCallbackData("address1room17");
                inlineKeyboardButtonRoom2.setCallbackData("address1room18");
                inlineKeyboardButtonRoom3.setCallbackData("address1room19");
                inlineKeyboardButtonRoom4.setCallbackData("address1room20");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 6:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address1room21"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address1room22"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address1room23"));
                inlineKeyboardButtonRoom1.setCallbackData("address1room21");
                inlineKeyboardButtonRoom2.setCallbackData("address1room22");
                inlineKeyboardButtonRoom3.setCallbackData("address1room23");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
        }
        rowList.add(keyboardButtonsRow5);
        inlineKeyboardButtonChooseAddress.setText(localeMessageService.getMessage("btn.back"));
        inlineKeyboardButtonChooseAddress.setCallbackData("ChooseAddress");
        keyboardButtonsRow6.add(inlineKeyboardButtonChooseAddress);
        rowList.add(keyboardButtonsRow6);

        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getAddress2Keyboard(int pageNumber){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonRoom1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom4 = new InlineKeyboardButton();

        InlineKeyboardButton inlineKeyboardButtonNext = new InlineKeyboardButton();
        inlineKeyboardButtonNext.setText("➡️");
        inlineKeyboardButtonNext.setCallbackData("ButtonNext-" + pageNumber + "-Address-2");
        InlineKeyboardButton inlineKeyboardButtonPrev = new InlineKeyboardButton();
        inlineKeyboardButtonPrev.setText("⬅️️");
        inlineKeyboardButtonPrev.setCallbackData("ButtonPrev-" + pageNumber + "-Address-2");
        InlineKeyboardButton inlineKeyboardButtonChooseAddress = new InlineKeyboardButton();

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow6 = new ArrayList<>();

        switch (pageNumber){
            case 1:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address2room1"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address2room2"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address2room3"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address2room4"));
                inlineKeyboardButtonRoom1.setCallbackData("address2room1");
                inlineKeyboardButtonRoom2.setCallbackData("address2room2");
                inlineKeyboardButtonRoom3.setCallbackData("address2room3");
                inlineKeyboardButtonRoom4.setCallbackData("address2room4");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 2:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address2room5"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address2room6"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address2room7"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address2room8"));
                inlineKeyboardButtonRoom1.setCallbackData("address2room5");
                inlineKeyboardButtonRoom2.setCallbackData("address2room6");
                inlineKeyboardButtonRoom3.setCallbackData("address2room7");
                inlineKeyboardButtonRoom4.setCallbackData("address2room8");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 3:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address2room9"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address2room10"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address2room11"));
                inlineKeyboardButtonRoom1.setCallbackData("address2room9");
                inlineKeyboardButtonRoom2.setCallbackData("address2room10");
                inlineKeyboardButtonRoom3.setCallbackData("address2room11");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                break;
        }
        rowList.add(keyboardButtonsRow5);
        inlineKeyboardButtonChooseAddress.setText(localeMessageService.getMessage("btn.back"));
        inlineKeyboardButtonChooseAddress.setCallbackData("ChooseAddress");
        keyboardButtonsRow6.add(inlineKeyboardButtonChooseAddress);
        rowList.add(keyboardButtonsRow6);

        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getAddress3Keyboard(int pageNumber){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonRoom1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom4 = new InlineKeyboardButton();

        InlineKeyboardButton inlineKeyboardButtonNext = new InlineKeyboardButton();
        inlineKeyboardButtonNext.setText("➡️");
        inlineKeyboardButtonNext.setCallbackData("ButtonNext-" + pageNumber + "-Address-3");
        InlineKeyboardButton inlineKeyboardButtonPrev = new InlineKeyboardButton();
        inlineKeyboardButtonPrev.setText("⬅️️");
        inlineKeyboardButtonPrev.setCallbackData("ButtonPrev-" + pageNumber + "-Address-3");
        InlineKeyboardButton inlineKeyboardButtonChooseAddress = new InlineKeyboardButton();

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow6 = new ArrayList<>();

        switch (pageNumber){
            case 1:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address3room1"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address3room2"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address3room3"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address3room4"));
                inlineKeyboardButtonRoom1.setCallbackData("address3room1");
                inlineKeyboardButtonRoom2.setCallbackData("address3room2");
                inlineKeyboardButtonRoom3.setCallbackData("address3room3");
                inlineKeyboardButtonRoom4.setCallbackData("address3room4");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 2:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address3room5"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address3room6"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address3room7"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address3room8"));
                inlineKeyboardButtonRoom1.setCallbackData("address3room5");
                inlineKeyboardButtonRoom2.setCallbackData("address3room6");
                inlineKeyboardButtonRoom3.setCallbackData("address3room7");
                inlineKeyboardButtonRoom4.setCallbackData("address3room8");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 3:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address3room9"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address3room10"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address3room11"));
                inlineKeyboardButtonRoom1.setCallbackData("address3room9");
                inlineKeyboardButtonRoom2.setCallbackData("address3room10");
                inlineKeyboardButtonRoom3.setCallbackData("address3room11");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                break;
        }
        rowList.add(keyboardButtonsRow5);
        inlineKeyboardButtonChooseAddress.setText(localeMessageService.getMessage("btn.back"));
        inlineKeyboardButtonChooseAddress.setCallbackData("ChooseAddress");
        keyboardButtonsRow6.add(inlineKeyboardButtonChooseAddress);
        rowList.add(keyboardButtonsRow6);

        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getAddress4Keyboard(int pageNumber){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonRoom1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom4 = new InlineKeyboardButton();

        InlineKeyboardButton inlineKeyboardButtonNext = new InlineKeyboardButton();
        inlineKeyboardButtonNext.setText("➡️");
        inlineKeyboardButtonNext.setCallbackData("ButtonNext-" + pageNumber + "-Address-4");
        InlineKeyboardButton inlineKeyboardButtonPrev = new InlineKeyboardButton();
        inlineKeyboardButtonPrev.setText("⬅️️");
        inlineKeyboardButtonPrev.setCallbackData("ButtonPrev-" + pageNumber + "-Address-4");
        InlineKeyboardButton inlineKeyboardButtonChooseAddress = new InlineKeyboardButton();

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow6 = new ArrayList<>();

        switch (pageNumber){
            case 1:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address4room1"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address4room2"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address4room3"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address4room4"));
                inlineKeyboardButtonRoom1.setCallbackData("address4room1");
                inlineKeyboardButtonRoom2.setCallbackData("address4room2");
                inlineKeyboardButtonRoom3.setCallbackData("address4room3");
                inlineKeyboardButtonRoom4.setCallbackData("address4room4");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 2:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address4room5"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address4room6"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address4room7"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address4room8"));
                inlineKeyboardButtonRoom1.setCallbackData("address4room5");
                inlineKeyboardButtonRoom2.setCallbackData("address4room6");
                inlineKeyboardButtonRoom3.setCallbackData("address4room7");
                inlineKeyboardButtonRoom4.setCallbackData("address4room8");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 3:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address4room9"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address4room10"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address4room11"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address4room12"));
                inlineKeyboardButtonRoom1.setCallbackData("address4room9");
                inlineKeyboardButtonRoom2.setCallbackData("address4room10");
                inlineKeyboardButtonRoom3.setCallbackData("address4room11");
                inlineKeyboardButtonRoom4.setCallbackData("address4room12");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 4:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address4room13"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address4room14"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address4room15"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address4room16"));
                inlineKeyboardButtonRoom1.setCallbackData("address4room13");
                inlineKeyboardButtonRoom2.setCallbackData("address4room14");
                inlineKeyboardButtonRoom3.setCallbackData("address4room15");
                inlineKeyboardButtonRoom4.setCallbackData("address4room16");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                break;
        }
        rowList.add(keyboardButtonsRow5);
        inlineKeyboardButtonChooseAddress.setText(localeMessageService.getMessage("btn.back"));
        inlineKeyboardButtonChooseAddress.setCallbackData("ChooseAddress");
        keyboardButtonsRow6.add(inlineKeyboardButtonChooseAddress);
        rowList.add(keyboardButtonsRow6);

        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getAddress5Keyboard(int pageNumber) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonRoom1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonRoom4 = new InlineKeyboardButton();

        InlineKeyboardButton inlineKeyboardButtonNext = new InlineKeyboardButton();
        inlineKeyboardButtonNext.setText("➡️");
        inlineKeyboardButtonNext.setCallbackData("ButtonNext-" + pageNumber + "-Address-5");
        InlineKeyboardButton inlineKeyboardButtonPrev = new InlineKeyboardButton();
        inlineKeyboardButtonPrev.setText("⬅️️");
        inlineKeyboardButtonPrev.setCallbackData("ButtonPrev-" + pageNumber + "-Address-5");
        InlineKeyboardButton inlineKeyboardButtonChooseAddress = new InlineKeyboardButton();

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow6 = new ArrayList<>();

        switch (pageNumber){
            case 1:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address5room1"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address5room2"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address5room3"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address5room4"));
                inlineKeyboardButtonRoom1.setCallbackData("address5room1");
                inlineKeyboardButtonRoom2.setCallbackData("address5room2");
                inlineKeyboardButtonRoom3.setCallbackData("address5room3");
                inlineKeyboardButtonRoom4.setCallbackData("address5room4");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 2:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address5room5"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address5room6"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address5room7"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address5room8"));
                inlineKeyboardButtonRoom1.setCallbackData("address5room5");
                inlineKeyboardButtonRoom2.setCallbackData("address5room6");
                inlineKeyboardButtonRoom3.setCallbackData("address5room7");
                inlineKeyboardButtonRoom4.setCallbackData("address5room8");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                keyboardButtonsRow5.add(inlineKeyboardButtonNext);
                break;
            case 3:
                inlineKeyboardButtonRoom1.setText(localeMessageService.getMessage("btn.address5room9"));
                inlineKeyboardButtonRoom2.setText(localeMessageService.getMessage("btn.address5room10"));
                inlineKeyboardButtonRoom3.setText(localeMessageService.getMessage("btn.address5room11"));
                inlineKeyboardButtonRoom4.setText(localeMessageService.getMessage("btn.address5room12"));
                inlineKeyboardButtonRoom1.setCallbackData("address5room9");
                inlineKeyboardButtonRoom2.setCallbackData("address5room10");
                inlineKeyboardButtonRoom3.setCallbackData("address5room11");
                inlineKeyboardButtonRoom4.setCallbackData("address5room12");
                keyboardButtonsRow1.add(inlineKeyboardButtonRoom1);
                keyboardButtonsRow2.add(inlineKeyboardButtonRoom2);
                keyboardButtonsRow3.add(inlineKeyboardButtonRoom3);
                keyboardButtonsRow4.add(inlineKeyboardButtonRoom4);
                rowList.add(keyboardButtonsRow1);
                rowList.add(keyboardButtonsRow2);
                rowList.add(keyboardButtonsRow3);
                rowList.add(keyboardButtonsRow4);
                keyboardButtonsRow5.add(inlineKeyboardButtonPrev);
                break;
        }
        rowList.add(keyboardButtonsRow5);
        inlineKeyboardButtonChooseAddress.setText(localeMessageService.getMessage("btn.back"));
        inlineKeyboardButtonChooseAddress.setCallbackData("ChooseAddress");
        keyboardButtonsRow6.add(inlineKeyboardButtonChooseAddress);
        rowList.add(keyboardButtonsRow6);

        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getRoomInfo(String data){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonMore = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonBack = new InlineKeyboardButton();

        inlineKeyboardButtonMore.setText(localeMessageService.getMessage("btn.more"));
        inlineKeyboardButtonBack.setText(localeMessageService.getMessage("btn.back"));
        inlineKeyboardButtonBack.setCallbackData("deleteMsg");
        inlineKeyboardButtonMore.setCallbackData(data+"_more");

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        keyboardButtonsRow1.add(inlineKeyboardButtonMore);
        keyboardButtonsRow2.add(inlineKeyboardButtonBack);
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getRoomInfoFinal(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton inlineKeyboardButtonMore = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButtonBack = new InlineKeyboardButton();

        inlineKeyboardButtonMore.setText(localeMessageService.getMessage("btn.final"));
        inlineKeyboardButtonBack.setText(localeMessageService.getMessage("btn.cancelFinal"));
        inlineKeyboardButtonBack.setCallbackData("deleteMsg");
        inlineKeyboardButtonMore.setUrl(localeMessageService.getMessage("url.admin"));

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        keyboardButtonsRow1.add(inlineKeyboardButtonMore);
        keyboardButtonsRow2.add(inlineKeyboardButtonBack);
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

}
