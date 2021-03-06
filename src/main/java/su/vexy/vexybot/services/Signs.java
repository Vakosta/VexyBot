package su.vexy.vexybot.services;

import org.telegram.telegrambots.api.objects.Message;
import su.vexy.vexybot.manager.ChatsManager;
import su.vexy.vexybot.manager.MessageManager;

import java.io.UnsupportedEncodingException;

public class Signs {
    public static boolean isGoogleSigns(Message message) throws UnsupportedEncodingException {
        String text = "";
        if (message.getText() != null)
            text = message.getText();
        String locale = ChatsManager.getLocale(message);
        String reverce = String.valueOf(new StringBuilder(text).reverse());
        if (locale.equalsIgnoreCase("ru")) {
            try {
                if (text.substring(0, 10).equalsIgnoreCase(MessageManager.RBText(message, "who.is.he") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 10).equalsIgnoreCase(MessageManager.RBText(message, "who.is.she") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 10).equalsIgnoreCase(MessageManager.RBText(message, "who.are") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 10).equalsIgnoreCase(MessageManager.RBText(message, "what.is") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (reverce.substring(0, 4).equalsIgnoreCase("отэ "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
        } else if (locale.equalsIgnoreCase("en")) {

        }
        return false;
    }

    public static boolean isGetAllNotesSigns(Message message) throws UnsupportedEncodingException {
        String text = "";
        if (message.getText() != null)
            text = message.getText();
        String locale = ChatsManager.getLocale(message);
        if (locale.equalsIgnoreCase("ru")) {
            try {
                if (text.substring(0, 17).equalsIgnoreCase(MessageManager.RBText(message, "to.read.the.note")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 18).equalsIgnoreCase(MessageManager.RBText(message, "to.view.the.note")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 15).equalsIgnoreCase(MessageManager.RBText(message, "to.delete.the.note")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 13).equalsIgnoreCase(MessageManager.RBText(message, "delete.the.note")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 18).equalsIgnoreCase(MessageManager.RBText(message, "to.view.all.notes")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 11).equalsIgnoreCase(MessageManager.RBText(message, "all.notes")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
        } else if (locale.equalsIgnoreCase("en")) {

        }
        return false;
    }

    public static boolean isCreateNoteSigns(Message message) throws UnsupportedEncodingException {
        String text = "";
        if (message.getText() != null)
            text = message.getText();
        String locale = ChatsManager.getLocale(message);
        if (locale.equalsIgnoreCase("ru")) {
            try {
                if (text.substring(0, 15).equalsIgnoreCase(MessageManager.RBText(message, "create.the.note") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 16).equalsIgnoreCase(MessageManager.RBText(message, "to.create.the.note") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 15).equalsIgnoreCase(MessageManager.RBText(message, "add.the.note") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.substring(0, 17).equalsIgnoreCase(MessageManager.RBText(message, "to.add.the.note") + " "))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
        } else if (locale.equalsIgnoreCase("en")) {

        }
        return false;
    }

    public static boolean isGetWeather(Message message) throws UnsupportedEncodingException {
        String text = "";
        if (message.getText() != null)
            text = message.getText();
        String locale = ChatsManager.getLocale(message);
        if (locale.equalsIgnoreCase("ru")) {
            try {
                if (text.equalsIgnoreCase(MessageManager.RBText(message, "get.the.weather")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.equalsIgnoreCase(MessageManager.RBText(message, "the.weather")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.equalsIgnoreCase(MessageManager.RBText(message, "what.is.the.weather")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
            try {
                if (text.equalsIgnoreCase(MessageManager.RBText(message, "say.the.weather")))
                    return true;
            } catch (StringIndexOutOfBoundsException e) {
            }
        } else if (locale.equalsIgnoreCase("en")) {

        }
        return false;
    }
}
