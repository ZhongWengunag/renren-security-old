package io.renren.modules.luck.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @auther:zwg
 * @Data:2019/8/13
 **/
@Data
@TableName("luck")
public class LuckEntity {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer gongzai;
    private Integer shuibei;
    private Integer ganxie;
    private Integer gouwudai;
    private Integer bijiben;
    private Integer shuqian;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGongzai() {
        return gongzai;
    }

    public void setGongzai(Integer gongzai) {
        this.gongzai = gongzai;
    }

    public Integer getShuibei() {
        return shuibei;
    }

    public void setShuibei(Integer shuibei) {
        this.shuibei = shuibei;
    }

    public Integer getGanxie() {
        return ganxie;
    }

    public void setGanxie(Integer ganxie) {
        this.ganxie = ganxie;
    }

    public Integer getGouwudai() {
        return gouwudai;
    }

    public void setGouwudai(Integer gouwudai) {
        this.gouwudai = gouwudai;
    }

    public Integer getBijiben() {
        return bijiben;
    }

    public void setBijiben(Integer bijiben) {
        this.bijiben = bijiben;
    }

    public Integer getShuqian() {
        return shuqian;
    }

    public void setShuqian(Integer shuqian) {
        this.shuqian = shuqian;
    }
}
