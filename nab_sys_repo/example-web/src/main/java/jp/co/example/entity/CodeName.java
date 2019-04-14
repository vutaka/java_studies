package jp.co.example.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * コード名称
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "CODE_NAME")
public class CodeName implements Serializable {

    private static final long serialVersionUID = 1L;

    /** コードID */
    private String codeId;

    /** コード値 */
    private String codeValue;

    /** 言語 */
    private String lang;

    /** ソート順 */
    private Short sortOrder;

    /** 名称 */
    private String codeName;

    /** コード略称 */
    private String shortName;

    /** オプション名称01 */
    private String option01;

    /** オプション名称02 */
    private String option02;

    /** オプション名称03 */
    private String option03;

    /** オプション名称04 */
    private String option04;

    /** オプション名称05 */
    private String option05;

    /** オプション名称06 */
    private String option06;

    /** オプション名称07 */
    private String option07;

    /** オプション名称08 */
    private String option08;

    /** オプション名称09 */
    private String option09;

    /** オプション名称10 */
    private String option10;

    /** codePattern関連プロパティ */
    private CodePattern codePattern;
    /**
     * コードIDを返します。
     *
     * @return コードID
     */
    @Id
    @Column(name = "CODE_ID", length = 8, nullable = false, unique = false, insertable = false, updatable = false)
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
    @Column(name = "CODE_VALUE", length = 2, nullable = false, unique = false, insertable = false, updatable = false)
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
     * 言語を返します。
     *
     * @return 言語
     */
    @Id
    @Column(name = "LANG", length = 2, nullable = false, unique = false)
    public String getLang() {
        return lang;
    }

    /**
     * 言語を設定します。
     *
     * @param lang 言語
     */
    public void setLang(String lang) {
        this.lang = lang;
    }
    /**
     * ソート順を返します。
     *
     * @return ソート順
     */
    @Column(name = "SORT_ORDER", precision = 5, nullable = false, unique = false)
    public Short getSortOrder() {
        return sortOrder;
    }

    /**
     * ソート順を設定します。
     *
     * @param sortOrder ソート順
     */
    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }
    /**
     * 名称を返します。
     *
     * @return 名称
     */
    @Column(name = "CODE_NAME", length = 50, nullable = false, unique = false)
    public String getCodeName() {
        return codeName;
    }

    /**
     * 名称を設定します。
     *
     * @param codeName 名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    /**
     * コード略称を返します。
     *
     * @return コード略称
     */
    @Column(name = "SHORT_NAME", length = 50, nullable = true, unique = false)
    public String getShortName() {
        return shortName;
    }

    /**
     * コード略称を設定します。
     *
     * @param shortName コード略称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    /**
     * オプション名称01を返します。
     *
     * @return オプション名称01
     */
    @Column(name = "OPTION01", length = 50, nullable = true, unique = false)
    public String getOption01() {
        return option01;
    }

    /**
     * オプション名称01を設定します。
     *
     * @param option01 オプション名称01
     */
    public void setOption01(String option01) {
        this.option01 = option01;
    }
    /**
     * オプション名称02を返します。
     *
     * @return オプション名称02
     */
    @Column(name = "OPTION02", length = 50, nullable = true, unique = false)
    public String getOption02() {
        return option02;
    }

    /**
     * オプション名称02を設定します。
     *
     * @param option02 オプション名称02
     */
    public void setOption02(String option02) {
        this.option02 = option02;
    }
    /**
     * オプション名称03を返します。
     *
     * @return オプション名称03
     */
    @Column(name = "OPTION03", length = 50, nullable = true, unique = false)
    public String getOption03() {
        return option03;
    }

    /**
     * オプション名称03を設定します。
     *
     * @param option03 オプション名称03
     */
    public void setOption03(String option03) {
        this.option03 = option03;
    }
    /**
     * オプション名称04を返します。
     *
     * @return オプション名称04
     */
    @Column(name = "OPTION04", length = 50, nullable = true, unique = false)
    public String getOption04() {
        return option04;
    }

    /**
     * オプション名称04を設定します。
     *
     * @param option04 オプション名称04
     */
    public void setOption04(String option04) {
        this.option04 = option04;
    }
    /**
     * オプション名称05を返します。
     *
     * @return オプション名称05
     */
    @Column(name = "OPTION05", length = 50, nullable = true, unique = false)
    public String getOption05() {
        return option05;
    }

    /**
     * オプション名称05を設定します。
     *
     * @param option05 オプション名称05
     */
    public void setOption05(String option05) {
        this.option05 = option05;
    }
    /**
     * オプション名称06を返します。
     *
     * @return オプション名称06
     */
    @Column(name = "OPTION06", length = 50, nullable = true, unique = false)
    public String getOption06() {
        return option06;
    }

    /**
     * オプション名称06を設定します。
     *
     * @param option06 オプション名称06
     */
    public void setOption06(String option06) {
        this.option06 = option06;
    }
    /**
     * オプション名称07を返します。
     *
     * @return オプション名称07
     */
    @Column(name = "OPTION07", length = 50, nullable = true, unique = false)
    public String getOption07() {
        return option07;
    }

    /**
     * オプション名称07を設定します。
     *
     * @param option07 オプション名称07
     */
    public void setOption07(String option07) {
        this.option07 = option07;
    }
    /**
     * オプション名称08を返します。
     *
     * @return オプション名称08
     */
    @Column(name = "OPTION08", length = 50, nullable = true, unique = false)
    public String getOption08() {
        return option08;
    }

    /**
     * オプション名称08を設定します。
     *
     * @param option08 オプション名称08
     */
    public void setOption08(String option08) {
        this.option08 = option08;
    }
    /**
     * オプション名称09を返します。
     *
     * @return オプション名称09
     */
    @Column(name = "OPTION09", length = 50, nullable = true, unique = false)
    public String getOption09() {
        return option09;
    }

    /**
     * オプション名称09を設定します。
     *
     * @param option09 オプション名称09
     */
    public void setOption09(String option09) {
        this.option09 = option09;
    }
    /**
     * オプション名称10を返します。
     *
     * @return オプション名称10
     */
    @Column(name = "OPTION10", length = 50, nullable = true, unique = false)
    public String getOption10() {
        return option10;
    }

    /**
     * オプション名称10を設定します。
     *
     * @param option10 オプション名称10
     */
    public void setOption10(String option10) {
        this.option10 = option10;
    }

    /**
     * codePatternを返します。
     *
     * @return codePattern
     */
    @ManyToOne
    @JoinColumns( {
        @JoinColumn(name = "CODE_ID", referencedColumnName = "CODE_ID"),
        @JoinColumn(name = "CODE_VALUE", referencedColumnName = "CODE_VALUE") })
    public CodePattern getCodePattern() {
        return codePattern;
    }

    /**
     * codePatternを設定します。
     *
     * @param codePattern codePattern
     */
    public void setCodePattern(CodePattern codePattern) {
        this.codePattern = codePattern;
    }
}
