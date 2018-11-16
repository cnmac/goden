package com.mooyle.goden.dao.mapper;

import com.mooyle.goden.domain.model.GodenUsers;
import com.mooyle.goden.domain.model.GodenUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GodenUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    long countByExample(GodenUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    int deleteByExample(GodenUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    int insert(GodenUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    int insertSelective(GodenUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    List<GodenUsers> selectByExample(GodenUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") GodenUsers record, @Param("example") GodenUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goden_users
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") GodenUsers record, @Param("example") GodenUsersExample example);

    GodenUsers getUserByID(@Param("userId") Long userId);
}