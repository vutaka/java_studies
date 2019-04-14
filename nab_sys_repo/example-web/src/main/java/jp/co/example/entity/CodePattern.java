package jp.co.example.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * コードパターン
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "CODE_PATTERN")
public class CodePattern implements Serializable {

    private static final long serialVersionUID = 1L;

    /** コードID */
    private String codeId;

    /** コード値 */
    private String codeValue;

    /** パターン01 */
    private String pattern01;

    /** パターン02 */
    private String pattern02;

    /** パターン03 */
    private String pattern03;

    /** パターン04 */
    private String pattern04;

    /** パターン05 */
    private String pattern05;

    /** パターン06 */
    private String pattern06;

    /** パターン07 */
    private String pattern07;

    /** パターン08 */
    private String pattern08;

    /** パターン09 */
    private String pattern09;

    /** パターン10 */
    private String pattern10;

    /** パターン11 */
    private String pattern11;

    /** パターン12 */
    private String pattern12;

    /** パターン13 */
    private String pattern13;

    /** パターン14 */
    private String pattern14;

    /** パターン15 */
    private String pattern15;

    /** パターン16 */
    private String pattern16;

    /** パターン17 */
    private String pattern17;

    /** パターン18 */
    private String pattern18;

    /** パターン19 */
    private String pattern19;

    /** パターン20 */
    private String pattern20;

    /** codeNameList関連プロパティ */
    private List<CodeName> codeNameList;
    /**
     * コードIDを返します。
     *
     * @return コードID
     */
    @Id
    @Column(name = "CODE_ID", length = 8, nullable = false, unique = false)
    public String getCodeId() {
        return codeId;
    }

    /**
     * コードIDを設定します。
     *
     * @param codeId コードID
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }
    /**
     * コード値を返します。
     *
     * @return コード値
     */
    @Id
    @Column(name = "CODE_VALUE", length = 2, nullable = false, unique = false)
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * コード値を設定します。
     *
     * @param codeValue コード値
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }
    /**
     * パターン01を返します。
     *
     * @return パターン01
     */
    @Column(name = "PATTERN01", length = 1, nullable = false, unique = false)
    public String getPattern01() {
        return pattern01;
    }

    /**
     * パターン01を設定します。
     *
     * @param pattern01 パターン01
     */
    public void setPattern01(String pattern01) {
        this.pattern01 = pattern01;
    }
    /**
     * パターン02を返します。
     *
     * @return パターン02
     */
    @Column(name = "PATTERN02", length = 1, nullable = true, unique = false)
    public String getPattern02() {
        return pattern02;
    }

    /**
     * パターン02を設定します。
     *
     * @param pattern02 パターン02
     */
    public void setPattern02(String pattern02) {
        this.pattern02 = pattern02;
    }
    /**
     * パターン03を返します。
     *
     * @return パターン03
     */
    @Column(name = "PATTERN03", length = 1, nullable = true, unique = false)
    public String getPattern03() {
        return pattern03;
    }

    /**
     * パターン03を設定します。
     *
     * @param pattern03 パターン03
     */
    public void setPattern03(String pattern03) {
        this.pattern03 = pattern03;
    }
    /**
     * パターン04を返します。
     *
     * @return パターン04
     */
    @Column(name = "PATTERN04", length = 1, nullable = true, unique = false)
    public String getPattern04() {
        return pattern04;
    }

    /**
     * パターン04を設定します。
     *
     * @param pattern04 パターン04
     */
    public void setPattern04(String pattern04) {
        this.pattern04 = pattern04;
    }
    /**
     * パターン05を返します。
     *
     * @return パターン05
     */
    @Column(name = "PATTERN05", length = 1, nullable = true, unique = false)
    public String getPattern05() {
        return pattern05;
    }

    /**
     * パターン05を設定します。
     *
     * @param pattern05 パターン05
     */
    public void setPattern05(String pattern05) {
        this.pattern05 = pattern05;
    }
    /**
     * パターン06を返します。
     *
     * @return パターン06
     */
    @Column(name = "PATTERN06", length = 1, nullable = true, unique = false)
    public String getPattern06() {
        return pattern06;
    }

    /**
     * パターン06を設定します。
     *
     * @param pattern06 パターン06
     */
    public void setPattern06(String pattern06) {
        this.pattern06 = pattern06;
    }
    /**
     * パターン07を返します。
     *
     * @return パターン07
     */
    @Column(name = "PATTERN07", length = 1, nullable = true, unique = false)
    public String getPattern07() {
        return pattern07;
    }

    /**
     * パターン07を設定します。
     *
     * @param pattern07 パターン07
     */
    public void setPattern07(String pattern07) {
        this.pattern07 = pattern07;
    }
    /**
     * パターン08を返します。
     *
     * @return パターン08
     */
    @Column(name = "PATTERN08", length = 1, nullable = true, unique = false)
    public String getPattern08() {
        return pattern08;
    }

    /**
     * パターン08を設定します。
     *
     * @param pattern08 パターン08
     */
    public void setPattern08(String pattern08) {
        this.pattern08 = pattern08;
    }
    /**
     * パターン09を返します。
     *
     * @return パターン09
     */
    @Column(name = "PATTERN09", length = 1, nullable = true, unique = false)
    public String getPattern09() {
        return pattern09;
    }

    /**
     * パターン09を設定します。
     *
     * @param pattern09 パターン09
     */
    public void setPattern09(String pattern09) {
        this.pattern09 = pattern09;
    }
    /**
     * パターン10を返します。
     *
     * @return パターン10
     */
    @Column(name = "PATTERN10", length = 1, nullable = true, unique = false)
    public String getPattern10() {
        return pattern10;
    }

    /**
     * パターン10を設定します。
     *
     * @param pattern10 パターン10
     */
    public void setPattern10(String pattern10) {
        this.pattern10 = pattern10;
    }
    /**
     * パターン11を返します。
     *
     * @return パターン11
     */
    @Column(name = "PATTERN11", length = 1, nullable = true, unique = false)
    public String getPattern11() {
        return pattern11;
    }

    /**
     * パターン11を設定します。
     *
     * @param pattern11 パターン11
     */
    public void setPattern11(String pattern11) {
        this.pattern11 = pattern11;
    }
    /**
     * パターン12を返します。
     *
     * @return パターン12
     */
    @Column(name = "PATTERN12", length = 1, nullable = true, unique = false)
    public String getPattern12() {
        return pattern12;
    }

    /**
     * パターン12を設定します。
     *
     * @param pattern12 パターン12
     */
    public void setPattern12(String pattern12) {
        this.pattern12 = pattern12;
    }
    /**
     * パターン13を返します。
     *
     * @return パターン13
     */
    @Column(name = "PATTERN13", length = 1, nullable = true, unique = false)
    public String getPattern13() {
        return pattern13;
    }

    /**
     * パターン13を設定します。
     *
     * @param pattern13 パターン13
     */
    public void setPattern13(String pattern13) {
        this.pattern13 = pattern13;
    }
    /**
     * パターン14を返します。
     *
     * @return パターン14
     */
    @Column(name = "PATTERN14", length = 1, nullable = true, unique = false)
    public String getPattern14() {
        return pattern14;
    }

    /**
     * パターン14を設定します。
     *
     * @param pattern14 パターン14
     */
    public void setPattern14(String pattern14) {
        this.pattern14 = pattern14;
    }
    /**
     * パターン15を返します。
     *
     * @return パターン15
     */
    @Column(name = "PATTERN15", length = 1, nullable = true, unique = false)
    public String getPattern15() {
        return pattern15;
    }

    /**
     * パターン15を設定します。
     *
     * @param pattern15 パターン15
     */
    public void setPattern15(String pattern15) {
        this.pattern15 = pattern15;
    }
    /**
     * パターン16を返します。
     *
     * @return パターン16
     */
    @Column(name = "PATTERN16", length = 1, nullable = true, unique = false)
    public String getPattern16() {
        return pattern16;
    }

    /**
     * パターン16を設定します。
     *
     * @param pattern16 パターン16
     */
    public void setPattern16(String pattern16) {
        this.pattern16 = pattern16;
    }
    /**
     * パターン17を返します。
     *
     * @return パターン17
     */
    @Column(name = "PATTERN17", length = 1, nullable = true, unique = false)
    public String getPattern17() {
        return pattern17;
    }

    /**
     * パターン17を設定します。
     *
     * @param pattern17 パターン17
     */
    public void setPattern17(String pattern17) {
        this.pattern17 = pattern17;
    }
    /**
     * パターン18を返します。
     *
     * @return パターン18
     */
    @Column(name = "PATTERN18", length = 1, nullable = true, unique = false)
    public String getPattern18() {
        return pattern18;
    }

    /**
     * パターン18を設定します。
     *
     * @param pattern18 パターン18
     */
    public void setPattern18(String pattern18) {
        this.pattern18 = pattern18;
    }
    /**
     * パターン19を返します。
     *
     * @return パターン19
     */
    @Column(name = "PATTERN19", length = 1, nullable = true, unique = false)
    public String getPattern19() {
        return pattern19;
    }

    /**
     * パターン19を設定します。
     *
     * @param pattern19 パターン19
     */
    public void setPattern19(String pattern19) {
        this.pattern19 = pattern19;
    }
    /**
     * パターン20を返します。
     *
     * @return パターン20
     */
    @Column(name = "PATTERN20", length = 1, nullable = true, unique = false)
    public String getPattern20() {
        return pattern20;
    }

    /**
     * パターン20を設定します。
     *
     * @param pattern20 パターン20
     */
    public void setPattern20(String pattern20) {
        this.pattern20 = pattern20;
    }

    /**
     * codeNameListを返します。
     *
     * @return codeNameList
     */
    @OneToMany(mappedBy = "codePattern")
    public List<CodeName> getCodeNameList() {
        return codeNameList;
    }

    /**
     * codeNameListを設定します。
     *
     * @param codeNameList codeNameList
     */
    public void setCodeNameList(List<CodeName> codeNameList) {
        this.codeNameList = codeNameList;
    }
}
