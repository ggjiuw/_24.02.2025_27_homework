package com.ggjiuw;

class MaxLengthFilter extends BaseStringFilter{
    int max;

    public MaxLengthFilter(int length) {
        this.max = length;
    }
    @Override
    protected String handle(String input) {
        if (input.length() > max)
            return null;
        return input;
    }
}