package com.yash.springdemo;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.yash.springdemo.model.Book;

public class BookSerializer extends JsonSerializer<Book> {

    @Override
    public void serialize(Book book, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeNumberField("id", book.getId());
        jgen.writeStringField("title", book.getTitle());
        jgen.writeStringField("author", book.getAuthor());
        jgen.writeEndObject();
    }

    @Override
    public Class<Book> handledType() {
        return Book.class;
    }
}