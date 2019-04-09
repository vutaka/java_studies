package jp.co.example.util;

/**
 * SettingExampleProvider
 */
public class SettingExampleProvider implements ExampleProvider {
  /** セッターインジェクションで何かしら値をセットしてみよう */
  private String strValue;

  /**
   * @param strValue the strValue to set
   */
  public void setStrValue(String strValue) {
    this.strValue = strValue;
  }

  /**
   * @return the strValue
   */
  public String getStrValue() {
    return strValue;
  }

  @Override
  public String getValue() {
    return this.getStrValue();
  }

}