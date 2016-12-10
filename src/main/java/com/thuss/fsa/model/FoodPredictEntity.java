package com.thuss.fsa.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by 陈威行 on 2016/12/10.
 */
@Entity
@Table(name = "food_predict", schema = "dbo", catalog = "hotel")
public class FoodPredictEntity {
    private long id;
    private Long hotelId;
    private String foodName;
    private Double unitMoney;
    private Date predictDate;
    private Long soldNum;
    private Long orderNum;
    private Double totalMoney;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hotel_id", nullable = true)
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    @Basic
    @Column(name = "food_name", nullable = true, length = 255)
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Basic
    @Column(name = "unit_money", nullable = true, precision = 0)
    public Double getUnitMoney() {
        return unitMoney;
    }

    public void setUnitMoney(Double unitMoney) {
        this.unitMoney = unitMoney;
    }

    @Basic
    @Column(name = "predict_date", nullable = true)
    public Date getPredictDate() {
        return predictDate;
    }

    public void setPredictDate(Date predictDate) {
        this.predictDate = predictDate;
    }

    @Basic
    @Column(name = "sold_num", nullable = true)
    public Long getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Long soldNum) {
        this.soldNum = soldNum;
    }

    @Basic
    @Column(name = "order_num", nullable = true)
    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "total_money", nullable = true, precision = 0)
    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodPredictEntity that = (FoodPredictEntity) o;

        if (id != that.id) return false;
        if (hotelId != null ? !hotelId.equals(that.hotelId) : that.hotelId != null) return false;
        if (foodName != null ? !foodName.equals(that.foodName) : that.foodName != null) return false;
        if (unitMoney != null ? !unitMoney.equals(that.unitMoney) : that.unitMoney != null) return false;
        if (predictDate != null ? !predictDate.equals(that.predictDate) : that.predictDate != null) return false;
        if (soldNum != null ? !soldNum.equals(that.soldNum) : that.soldNum != null) return false;
        if (orderNum != null ? !orderNum.equals(that.orderNum) : that.orderNum != null) return false;
        if (totalMoney != null ? !totalMoney.equals(that.totalMoney) : that.totalMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hotelId != null ? hotelId.hashCode() : 0);
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        result = 31 * result + (unitMoney != null ? unitMoney.hashCode() : 0);
        result = 31 * result + (predictDate != null ? predictDate.hashCode() : 0);
        result = 31 * result + (soldNum != null ? soldNum.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        result = 31 * result + (totalMoney != null ? totalMoney.hashCode() : 0);
        return result;
    }
}
