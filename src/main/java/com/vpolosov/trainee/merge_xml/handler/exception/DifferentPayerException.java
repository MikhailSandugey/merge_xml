package com.vpolosov.trainee.merge_xml.handler.exception;

/**
 * Исключение выбрасываемое при различных плательщиках.
 *
 * @author Maksim Litvinenko
 */
public class DifferentPayerException extends RuntimeException {

    /**
     * Конструктор с одним параметром.
     *
     * @param message текст ошибки.
     */
    public DifferentPayerException(String message) {
        super(message);
    }
}
