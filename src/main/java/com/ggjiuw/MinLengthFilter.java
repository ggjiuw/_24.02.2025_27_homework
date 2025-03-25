package com.ggjiuw;

class MinLengthFilter extends BaseStringFilter{
    int min;

    public MinLengthFilter(int length) {
        this.min = length;
    }

    @Override
    protected String handle(String input) {
        if (input.length() < min)
            return null;
        return input;
    }
}
