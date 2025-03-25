package com.ggjiuw;

class DigitFilter extends BaseStringFilter {
    @Override
    protected String handle(String input) {
        return input.replaceAll("\\d", "");
    }
}
