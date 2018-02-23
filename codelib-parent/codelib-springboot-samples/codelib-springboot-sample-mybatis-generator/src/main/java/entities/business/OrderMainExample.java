package entities.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderMainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUuidIsNull() {
            addCriterion("ORDER_UUID is null");
            return (Criteria) this;
        }

        public Criteria andOrderUuidIsNotNull() {
            addCriterion("ORDER_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUuidEqualTo(String value) {
            addCriterion("ORDER_UUID =", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidNotEqualTo(String value) {
            addCriterion("ORDER_UUID <>", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidGreaterThan(String value) {
            addCriterion("ORDER_UUID >", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_UUID >=", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidLessThan(String value) {
            addCriterion("ORDER_UUID <", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidLessThanOrEqualTo(String value) {
            addCriterion("ORDER_UUID <=", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidLike(String value) {
            addCriterion("ORDER_UUID like", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidNotLike(String value) {
            addCriterion("ORDER_UUID not like", value, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidIn(List<String> values) {
            addCriterion("ORDER_UUID in", values, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidNotIn(List<String> values) {
            addCriterion("ORDER_UUID not in", values, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidBetween(String value1, String value2) {
            addCriterion("ORDER_UUID between", value1, value2, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidNotBetween(String value1, String value2) {
            addCriterion("ORDER_UUID not between", value1, value2, "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("ORDER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("ORDER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("ORDER_CODE =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("ORDER_CODE <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("ORDER_CODE >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("ORDER_CODE <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("ORDER_CODE like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("ORDER_CODE not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("ORDER_CODE in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("ORDER_CODE not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("ORDER_CODE between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CODE not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIsNull() {
            addCriterion("PROJECT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIsNotNull() {
            addCriterion("PROJECT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAmountEqualTo(BigDecimal value) {
            addCriterion("PROJECT_AMOUNT =", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotEqualTo(BigDecimal value) {
            addCriterion("PROJECT_AMOUNT <>", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountGreaterThan(BigDecimal value) {
            addCriterion("PROJECT_AMOUNT >", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_AMOUNT >=", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountLessThan(BigDecimal value) {
            addCriterion("PROJECT_AMOUNT <", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROJECT_AMOUNT <=", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIn(List<BigDecimal> values) {
            addCriterion("PROJECT_AMOUNT in", values, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotIn(List<BigDecimal> values) {
            addCriterion("PROJECT_AMOUNT not in", values, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_AMOUNT between", value1, value2, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROJECT_AMOUNT not between", value1, value2, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountIsNull() {
            addCriterion("LOGISTICS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountIsNotNull() {
            addCriterion("LOGISTICS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_AMOUNT =", value, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountNotEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_AMOUNT <>", value, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountGreaterThan(BigDecimal value) {
            addCriterion("LOGISTICS_AMOUNT >", value, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_AMOUNT >=", value, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountLessThan(BigDecimal value) {
            addCriterion("LOGISTICS_AMOUNT <", value, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTICS_AMOUNT <=", value, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountIn(List<BigDecimal> values) {
            addCriterion("LOGISTICS_AMOUNT in", values, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountNotIn(List<BigDecimal> values) {
            addCriterion("LOGISTICS_AMOUNT not in", values, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTICS_AMOUNT between", value1, value2, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andLogisticsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTICS_AMOUNT not between", value1, value2, "logisticsAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeIsNull() {
            addCriterion("HOSPITAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeIsNotNull() {
            addCriterion("HOSPITAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeEqualTo(String value) {
            addCriterion("HOSPITAL_CODE =", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotEqualTo(String value) {
            addCriterion("HOSPITAL_CODE <>", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeGreaterThan(String value) {
            addCriterion("HOSPITAL_CODE >", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_CODE >=", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLessThan(String value) {
            addCriterion("HOSPITAL_CODE <", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLessThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_CODE <=", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLike(String value) {
            addCriterion("HOSPITAL_CODE like", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotLike(String value) {
            addCriterion("HOSPITAL_CODE not like", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeIn(List<String> values) {
            addCriterion("HOSPITAL_CODE in", values, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotIn(List<String> values) {
            addCriterion("HOSPITAL_CODE not in", values, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeBetween(String value1, String value2) {
            addCriterion("HOSPITAL_CODE between", value1, value2, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotBetween(String value1, String value2) {
            addCriterion("HOSPITAL_CODE not between", value1, value2, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeIsNull() {
            addCriterion("BED_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBedCodeIsNotNull() {
            addCriterion("BED_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBedCodeEqualTo(String value) {
            addCriterion("BED_CODE =", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeNotEqualTo(String value) {
            addCriterion("BED_CODE <>", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeGreaterThan(String value) {
            addCriterion("BED_CODE >", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BED_CODE >=", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeLessThan(String value) {
            addCriterion("BED_CODE <", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeLessThanOrEqualTo(String value) {
            addCriterion("BED_CODE <=", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeLike(String value) {
            addCriterion("BED_CODE like", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeNotLike(String value) {
            addCriterion("BED_CODE not like", value, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeIn(List<String> values) {
            addCriterion("BED_CODE in", values, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeNotIn(List<String> values) {
            addCriterion("BED_CODE not in", values, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeBetween(String value1, String value2) {
            addCriterion("BED_CODE between", value1, value2, "bedCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeNotBetween(String value1, String value2) {
            addCriterion("BED_CODE not between", value1, value2, "bedCode");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianIsNull() {
            addCriterion("ATTENDING_PHYSICIAN is null");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianIsNotNull() {
            addCriterion("ATTENDING_PHYSICIAN is not null");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianEqualTo(String value) {
            addCriterion("ATTENDING_PHYSICIAN =", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianNotEqualTo(String value) {
            addCriterion("ATTENDING_PHYSICIAN <>", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianGreaterThan(String value) {
            addCriterion("ATTENDING_PHYSICIAN >", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDING_PHYSICIAN >=", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianLessThan(String value) {
            addCriterion("ATTENDING_PHYSICIAN <", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianLessThanOrEqualTo(String value) {
            addCriterion("ATTENDING_PHYSICIAN <=", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianLike(String value) {
            addCriterion("ATTENDING_PHYSICIAN like", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianNotLike(String value) {
            addCriterion("ATTENDING_PHYSICIAN not like", value, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianIn(List<String> values) {
            addCriterion("ATTENDING_PHYSICIAN in", values, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianNotIn(List<String> values) {
            addCriterion("ATTENDING_PHYSICIAN not in", values, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianBetween(String value1, String value2) {
            addCriterion("ATTENDING_PHYSICIAN between", value1, value2, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianNotBetween(String value1, String value2) {
            addCriterion("ATTENDING_PHYSICIAN not between", value1, value2, "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Short value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Short value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Short value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Short value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Short> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Short> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Short value1, Short value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("REPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("REPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("REPORT_TYPE =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("REPORT_TYPE <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("REPORT_TYPE >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_TYPE >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("REPORT_TYPE <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_TYPE <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("REPORT_TYPE like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("REPORT_TYPE not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("REPORT_TYPE in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("REPORT_TYPE not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("REPORT_TYPE between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("REPORT_TYPE not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIsNull() {
            addCriterion("LOGISTICS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIsNotNull() {
            addCriterion("LOGISTICS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeEqualTo(String value) {
            addCriterion("LOGISTICS_TYPE =", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotEqualTo(String value) {
            addCriterion("LOGISTICS_TYPE <>", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeGreaterThan(String value) {
            addCriterion("LOGISTICS_TYPE >", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_TYPE >=", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLessThan(String value) {
            addCriterion("LOGISTICS_TYPE <", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICS_TYPE <=", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLike(String value) {
            addCriterion("LOGISTICS_TYPE like", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotLike(String value) {
            addCriterion("LOGISTICS_TYPE not like", value, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeIn(List<String> values) {
            addCriterion("LOGISTICS_TYPE in", values, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotIn(List<String> values) {
            addCriterion("LOGISTICS_TYPE not in", values, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeBetween(String value1, String value2) {
            addCriterion("LOGISTICS_TYPE between", value1, value2, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeNotBetween(String value1, String value2) {
            addCriterion("LOGISTICS_TYPE not between", value1, value2, "logisticsType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeIsNull() {
            addCriterion("PAID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaidTypeIsNotNull() {
            addCriterion("PAID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTypeEqualTo(Short value) {
            addCriterion("PAID_TYPE =", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeNotEqualTo(Short value) {
            addCriterion("PAID_TYPE <>", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeGreaterThan(Short value) {
            addCriterion("PAID_TYPE >", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PAID_TYPE >=", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeLessThan(Short value) {
            addCriterion("PAID_TYPE <", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeLessThanOrEqualTo(Short value) {
            addCriterion("PAID_TYPE <=", value, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeIn(List<Short> values) {
            addCriterion("PAID_TYPE in", values, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeNotIn(List<Short> values) {
            addCriterion("PAID_TYPE not in", values, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeBetween(Short value1, Short value2) {
            addCriterion("PAID_TYPE between", value1, value2, "paidType");
            return (Criteria) this;
        }

        public Criteria andPaidTypeNotBetween(Short value1, Short value2) {
            addCriterion("PAID_TYPE not between", value1, value2, "paidType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("DOCTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("DOCTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(String value) {
            addCriterion("DOCTOR_ID =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(String value) {
            addCriterion("DOCTOR_ID <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(String value) {
            addCriterion("DOCTOR_ID >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTOR_ID >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(String value) {
            addCriterion("DOCTOR_ID <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("DOCTOR_ID <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLike(String value) {
            addCriterion("DOCTOR_ID like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotLike(String value) {
            addCriterion("DOCTOR_ID not like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<String> values) {
            addCriterion("DOCTOR_ID in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<String> values) {
            addCriterion("DOCTOR_ID not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(String value1, String value2) {
            addCriterion("DOCTOR_ID between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(String value1, String value2) {
            addCriterion("DOCTOR_ID not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdIsNull() {
            addCriterion("PROFESSOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andProfessorIdIsNotNull() {
            addCriterion("PROFESSOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorIdEqualTo(String value) {
            addCriterion("PROFESSOR_ID =", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotEqualTo(String value) {
            addCriterion("PROFESSOR_ID <>", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdGreaterThan(String value) {
            addCriterion("PROFESSOR_ID >", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSOR_ID >=", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLessThan(String value) {
            addCriterion("PROFESSOR_ID <", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLessThanOrEqualTo(String value) {
            addCriterion("PROFESSOR_ID <=", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLike(String value) {
            addCriterion("PROFESSOR_ID like", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotLike(String value) {
            addCriterion("PROFESSOR_ID not like", value, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdIn(List<String> values) {
            addCriterion("PROFESSOR_ID in", values, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotIn(List<String> values) {
            addCriterion("PROFESSOR_ID not in", values, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdBetween(String value1, String value2) {
            addCriterion("PROFESSOR_ID between", value1, value2, "professorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdNotBetween(String value1, String value2) {
            addCriterion("PROFESSOR_ID not between", value1, value2, "professorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("CREATE_USERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("CREATE_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(String value) {
            addCriterion("CREATE_USERID =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(String value) {
            addCriterion("CREATE_USERID <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(String value) {
            addCriterion("CREATE_USERID >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USERID >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(String value) {
            addCriterion("CREATE_USERID <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USERID <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLike(String value) {
            addCriterion("CREATE_USERID like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotLike(String value) {
            addCriterion("CREATE_USERID not like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<String> values) {
            addCriterion("CREATE_USERID in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<String> values) {
            addCriterion("CREATE_USERID not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(String value1, String value2) {
            addCriterion("CREATE_USERID between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(String value1, String value2) {
            addCriterion("CREATE_USERID not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("MODIFIED_TIME =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("MODIFIED_TIME >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("MODIFIED_TIME <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("MODIFIED_TIME in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("MODIFIED_TIME not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridIsNull() {
            addCriterion("MODIFIED_USERID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridIsNotNull() {
            addCriterion("MODIFIED_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridEqualTo(String value) {
            addCriterion("MODIFIED_USERID =", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotEqualTo(String value) {
            addCriterion("MODIFIED_USERID <>", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridGreaterThan(String value) {
            addCriterion("MODIFIED_USERID >", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USERID >=", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLessThan(String value) {
            addCriterion("MODIFIED_USERID <", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_USERID <=", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLike(String value) {
            addCriterion("MODIFIED_USERID like", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotLike(String value) {
            addCriterion("MODIFIED_USERID not like", value, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridIn(List<String> values) {
            addCriterion("MODIFIED_USERID in", values, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotIn(List<String> values) {
            addCriterion("MODIFIED_USERID not in", values, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridBetween(String value1, String value2) {
            addCriterion("MODIFIED_USERID between", value1, value2, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_USERID not between", value1, value2, "modifiedUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUuidLikeInsensitive(String value) {
            addCriterion("upper(ORDER_UUID) like", value.toUpperCase(), "orderUuid");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLikeInsensitive(String value) {
            addCriterion("upper(ORDER_CODE) like", value.toUpperCase(), "orderCode");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(USER_NAME) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andGenderLikeInsensitive(String value) {
            addCriterion("upper(GENDER) like", value.toUpperCase(), "gender");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(MOBILE) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(ADDRESS) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLikeInsensitive(String value) {
            addCriterion("upper(HOSPITAL_CODE) like", value.toUpperCase(), "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andBedCodeLikeInsensitive(String value) {
            addCriterion("upper(BED_CODE) like", value.toUpperCase(), "bedCode");
            return (Criteria) this;
        }

        public Criteria andAttendingPhysicianLikeInsensitive(String value) {
            addCriterion("upper(ATTENDING_PHYSICIAN) like", value.toUpperCase(), "attendingPhysician");
            return (Criteria) this;
        }

        public Criteria andReportTypeLikeInsensitive(String value) {
            addCriterion("upper(REPORT_TYPE) like", value.toUpperCase(), "reportType");
            return (Criteria) this;
        }

        public Criteria andLogisticsTypeLikeInsensitive(String value) {
            addCriterion("upper(LOGISTICS_TYPE) like", value.toUpperCase(), "logisticsType");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(MEMO) like", value.toUpperCase(), "memo");
            return (Criteria) this;
        }

        public Criteria andIntroductionLikeInsensitive(String value) {
            addCriterion("upper(INTRODUCTION) like", value.toUpperCase(), "introduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLikeInsensitive(String value) {
            addCriterion("upper(COMPANY_ID) like", value.toUpperCase(), "companyId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLikeInsensitive(String value) {
            addCriterion("upper(DOCTOR_ID) like", value.toUpperCase(), "doctorId");
            return (Criteria) this;
        }

        public Criteria andProfessorIdLikeInsensitive(String value) {
            addCriterion("upper(PROFESSOR_ID) like", value.toUpperCase(), "professorId");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLikeInsensitive(String value) {
            addCriterion("upper(CREATE_USERID) like", value.toUpperCase(), "createUserid");
            return (Criteria) this;
        }

        public Criteria andModifiedUseridLikeInsensitive(String value) {
            addCriterion("upper(MODIFIED_USERID) like", value.toUpperCase(), "modifiedUserid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}