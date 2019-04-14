package jp.co.example.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

    /** 名称 */
    private String codeName;

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
}
