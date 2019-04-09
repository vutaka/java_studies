package jp.co.example.util;

import java.util.Date;

/**
 * DateExampleProvider
 */
public class DateExampleProvider implements ExampleProvider {
  @Override
  public String getValue() {
    return (new Date()).toString();
  }

}