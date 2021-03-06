package com.lin.dao.peotry;

import com.lin.entity.peotry.PoetryWordBean;
import com.lin.entity.peotry.PoetryWordBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryWordBeanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    long countByExample(PoetryWordBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int deleteByExample(PoetryWordBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int insert(PoetryWordBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int insertSelective(PoetryWordBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    List<PoetryWordBean> selectByExample(PoetryWordBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    PoetryWordBean selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") PoetryWordBean record, @Param("example") PoetryWordBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int updateByExample(@Param("record") PoetryWordBean record, @Param("example") PoetryWordBeanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int updateByPrimaryKeySelective(PoetryWordBean record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poetry_word
     *
     * @mbg.generated Mon Feb 05 16:55:49 CST 2018
     */
    int updateByPrimaryKey(PoetryWordBean record);
}