package jp.co.example.util;

import nablarch.core.repository.SystemRepository;

/**
 * ExampleUtil
 */
public class ExampleUtil {

  /** コンストラクタを隠蔽する。 */
  private ExampleUtil() {
  }

  /** システムリポジトリへの登録名 */
  private static final String PROVIDER_NAME = "exampleProvider";

  /**
   * システムリポジトリからExampleManager実装を取得する。
   * @return ExampleManager
   */
  private static ExampleProvider getProvider() {
    return SystemRepository.get(PROVIDER_NAME);
  }

  /**
   * なんらかの値を返す
   * @return なんらかの値
   */
  public static String getValue() {
    return getProvider().getValue();
  }
}