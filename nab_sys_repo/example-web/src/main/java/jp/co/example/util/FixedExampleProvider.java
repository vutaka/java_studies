package jp.co.example.util;

/**
 * FixedExampleProvider
 */
public class FixedExampleProvider implements ExampleProvider {
  @Override
  public String getValue() {
    return this.getClass().toString();
  }

}