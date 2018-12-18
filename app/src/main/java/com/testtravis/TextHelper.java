package com.testtravis;

public class TextHelper {

    private static TextHelper textHelper = null;

    public static TextHelper getInstance() {
        if (textHelper == null) {
            textHelper = new TextHelper();
        }
         return textHelper;
    }

    public String getText(int progress) {
        if (progress >= 0 && progress < 50) {
            return "Low";
        } else {
            return "High";
        }
    }

}
