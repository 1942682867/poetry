package com.lin.entity.peotry;

import com.lin.entity.BaseEntity;

public class PoetryWordBean extends BaseEntity {
    /**
     * 
     * 表字段 : poetry_word.id
     */
    private Integer id;

    /**
     * 字词
     * 表字段 : poetry_word.word
     */
    private String word;

    /**
     * 字词长度：最长保存2个字
     * 表字段 : poetry_word.word_size
     */
    private Integer wordSize;

    /**
     * 最后一个字的韵母：关联韵母表
     * 表字段 : poetry_word.word_final_type
     */
    private Integer wordFinalType;

    /**
     * 平仄韵律：1-平声，2-仄声，11-平平，22-仄仄，1-平仄，21-仄平
     * 表字段 : poetry_word.rhythm
     */
    private Integer rhythm;

    private WordFinalBean wordFinalBean;

    /**
     * 获取  字段:poetry_word.id
     *
     * @return poetry_word.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:poetry_word.id
     *
     * @param id the value for poetry_word.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 字词 字段:poetry_word.word
     *
     * @return poetry_word.word, 字词
     */
    public String getWord() {
        return word;
    }

    /**
     * 设置 字词 字段:poetry_word.word
     *
     * @param word the value for poetry_word.word, 字词
     */
    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    /**
     * 获取 字词长度：最长保存2个字 字段:poetry_word.word_size
     *
     * @return poetry_word.word_size, 字词长度：最长保存2个字
     */
    public Integer getWordSize() {
        return wordSize;
    }

    /**
     * 设置 字词长度：最长保存2个字 字段:poetry_word.word_size
     *
     * @param wordSize the value for poetry_word.word_size, 字词长度：最长保存2个字
     */
    public void setWordSize(Integer wordSize) {
        this.wordSize = wordSize;
    }

    /**
     * 获取 最后一个字的韵母：关联韵母表 字段:poetry_word.word_final_type
     *
     * @return poetry_word.word_final_type, 最后一个字的韵母：关联韵母表
     */
    public Integer getWordFinalType() {
        return wordFinalType;
    }

    /**
     * 设置 最后一个字的韵母：关联韵母表 字段:poetry_word.word_final_type
     *
     * @param wordFinalType the value for poetry_word.word_final_type, 最后一个字的韵母：关联韵母表
     */
    public void setWordFinalType(Integer wordFinalType) {
        this.wordFinalType = wordFinalType;
    }

    /**
     * 获取 平仄韵律：1-平声，2-仄声，11-平平，22-仄仄，1-平仄，21-仄平 字段:poetry_word.rhythm
     *
     * @return poetry_word.rhythm, 平仄韵律：1-平声，2-仄声，11-平平，22-仄仄，1-平仄，21-仄平
     */
    public Integer getRhythm() {
        return rhythm;
    }

    /**
     * 设置 平仄韵律：1-平声，2-仄声，11-平平，22-仄仄，1-平仄，21-仄平 字段:poetry_word.rhythm
     *
     * @param rhythm the value for poetry_word.rhythm, 平仄韵律：1-平声，2-仄声，11-平平，22-仄仄，1-平仄，21-仄平
     */
    public void setRhythm(Integer rhythm) {
        this.rhythm = rhythm;
    }

    /**
     * ,poetry_word
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
        PoetryWordBean other = (PoetryWordBean) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWord() == null ? other.getWord() == null : this.getWord().equals(other.getWord()))
            && (this.getWordSize() == null ? other.getWordSize() == null : this.getWordSize().equals(other.getWordSize()))
            && (this.getWordFinalType() == null ? other.getWordFinalType() == null : this.getWordFinalType().equals(other.getWordFinalType()))
            && (this.getRhythm() == null ? other.getRhythm() == null : this.getRhythm().equals(other.getRhythm()));
    }

    /**
     * ,poetry_word
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWord() == null) ? 0 : getWord().hashCode());
        result = prime * result + ((getWordSize() == null) ? 0 : getWordSize().hashCode());
        result = prime * result + ((getWordFinalType() == null) ? 0 : getWordFinalType().hashCode());
        result = prime * result + ((getRhythm() == null) ? 0 : getRhythm().hashCode());
        return result;
    }

    public WordFinalBean getWordFinalBean() {
        return wordFinalBean;
    }

    public void setWordFinalBean(WordFinalBean wordFinalBean) {
        this.wordFinalBean=wordFinalBean;
    }
}