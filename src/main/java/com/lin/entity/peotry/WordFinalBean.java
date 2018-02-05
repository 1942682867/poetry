package com.lin.entity.peotry;

import com.lin.entity.BaseEntity;

public class WordFinalBean extends BaseEntity {
    /**
     * 
     * 表字段 : word_final.id
     */
    private Integer id;

    /**
     * 代表韵母的数字
     * 表字段 : word_final.final_type
     */
    private Integer finalType;

    /**
     * 韵母
     * 表字段 : word_final.final_name
     */
    private String finalName;

    /**
     * 韵母示例
     * 表字段 : word_final.final_show
     */
    private String finalShow;

    /**
     * 获取  字段:word_final.id
     *
     * @return word_final.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:word_final.id
     *
     * @param id the value for word_final.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 代表韵母的数字 字段:word_final.final_type
     *
     * @return word_final.final_type, 代表韵母的数字
     */
    public Integer getFinalType() {
        return finalType;
    }

    /**
     * 设置 代表韵母的数字 字段:word_final.final_type
     *
     * @param finalType the value for word_final.final_type, 代表韵母的数字
     */
    public void setFinalType(Integer finalType) {
        this.finalType = finalType;
    }

    /**
     * 获取 韵母 字段:word_final.final_name
     *
     * @return word_final.final_name, 韵母
     */
    public String getFinalName() {
        return finalName;
    }

    /**
     * 设置 韵母 字段:word_final.final_name
     *
     * @param finalName the value for word_final.final_name, 韵母
     */
    public void setFinalName(String finalName) {
        this.finalName = finalName == null ? null : finalName.trim();
    }

    /**
     * 获取 韵母示例 字段:word_final.final_show
     *
     * @return word_final.final_show, 韵母示例
     */
    public String getFinalShow() {
        return finalShow;
    }

    /**
     * 设置 韵母示例 字段:word_final.final_show
     *
     * @param finalShow the value for word_final.final_show, 韵母示例
     */
    public void setFinalShow(String finalShow) {
        this.finalShow = finalShow == null ? null : finalShow.trim();
    }

    /**
     * ,word_final
     *
     * @param that
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WordFinalBean other = (WordFinalBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFinalType() == null ? other.getFinalType() == null : this.getFinalType().equals(other.getFinalType()))
            && (this.getFinalName() == null ? other.getFinalName() == null : this.getFinalName().equals(other.getFinalName()))
            && (this.getFinalShow() == null ? other.getFinalShow() == null : this.getFinalShow().equals(other.getFinalShow()));
    }

    /**
     * ,word_final
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFinalType() == null) ? 0 : getFinalType().hashCode());
        result = prime * result + ((getFinalName() == null) ? 0 : getFinalName().hashCode());
        result = prime * result + ((getFinalShow() == null) ? 0 : getFinalShow().hashCode());
        return result;
    }
}