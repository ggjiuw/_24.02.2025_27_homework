package com.ggjiuw;

interface StringFilter {
    void setNext(StringFilter next);

    String process(String input);
}
