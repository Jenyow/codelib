package entities.business;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadyAreaCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReadyAreaCostExample() {
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

        public Criteria andAreaCostIdIsNull() {
            addCriterion("AREA_COST_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdIsNotNull() {
            addCriterion("AREA_COST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdEqualTo(String value) {
            addCriterion("AREA_COST_ID =", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdNotEqualTo(String value) {
            addCriterion("AREA_COST_ID <>", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdGreaterThan(String value) {
            addCriterion("AREA_COST_ID >", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_COST_ID >=", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdLessThan(String value) {
            addCriterion("AREA_COST_ID <", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_COST_ID <=", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdLike(String value) {
            addCriterion("AREA_COST_ID like", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdNotLike(String value) {
            addCriterion("AREA_COST_ID not like", value, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdIn(List<String> values) {
            addCriterion("AREA_COST_ID in", values, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdNotIn(List<String> values) {
            addCriterion("AREA_COST_ID not in", values, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdBetween(String value1, String value2) {
            addCriterion("AREA_COST_ID between", value1, value2, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andAreaCostIdNotBetween(String value1, String value2) {
            addCriterion("AREA_COST_ID not between", value1, value2, "areaCostId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("EXPRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("EXPRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(String value) {
            addCriterion("EXPRESS_ID =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(String value) {
            addCriterion("EXPRESS_ID <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(String value) {
            addCriterion("EXPRESS_ID >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESS_ID >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(String value) {
            addCriterion("EXPRESS_ID <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(String value) {
            addCriterion("EXPRESS_ID <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLike(String value) {
            addCriterion("EXPRESS_ID like", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotLike(String value) {
            addCriterion("EXPRESS_ID not like", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<String> values) {
            addCriterion("EXPRESS_ID in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<String> values) {
            addCriterion("EXPRESS_ID not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(String value1, String value2) {
            addCriterion("EXPRESS_ID between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(String value1, String value2) {
            addCriterion("EXPRESS_ID not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsIsNull() {
            addCriterion("COST_LOGISTICS is null");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsIsNotNull() {
            addCriterion("COST_LOGISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsEqualTo(BigDecimal value) {
            addCriterion("COST_LOGISTICS =", value, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsNotEqualTo(BigDecimal value) {
            addCriterion("COST_LOGISTICS <>", value, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsGreaterThan(BigDecimal value) {
            addCriterion("COST_LOGISTICS >", value, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_LOGISTICS >=", value, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsLessThan(BigDecimal value) {
            addCriterion("COST_LOGISTICS <", value, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_LOGISTICS <=", value, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsIn(List<BigDecimal> values) {
            addCriterion("COST_LOGISTICS in", values, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsNotIn(List<BigDecimal> values) {
            addCriterion("COST_LOGISTICS not in", values, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_LOGISTICS between", value1, value2, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostLogisticsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_LOGISTICS not between", value1, value2, "costLogistics");
            return (Criteria) this;
        }

        public Criteria andCostColdChainIsNull() {
            addCriterion("COST_COLD_CHAIN is null");
            return (Criteria) this;
        }

        public Criteria andCostColdChainIsNotNull() {
            addCriterion("COST_COLD_CHAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCostColdChainEqualTo(BigDecimal value) {
            addCriterion("COST_COLD_CHAIN =", value, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainNotEqualTo(BigDecimal value) {
            addCriterion("COST_COLD_CHAIN <>", value, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainGreaterThan(BigDecimal value) {
            addCriterion("COST_COLD_CHAIN >", value, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_COLD_CHAIN >=", value, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainLessThan(BigDecimal value) {
            addCriterion("COST_COLD_CHAIN <", value, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_COLD_CHAIN <=", value, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainIn(List<BigDecimal> values) {
            addCriterion("COST_COLD_CHAIN in", values, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainNotIn(List<BigDecimal> values) {
            addCriterion("COST_COLD_CHAIN not in", values, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_COLD_CHAIN between", value1, value2, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andCostColdChainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_COLD_CHAIN not between", value1, value2, "costColdChain");
            return (Criteria) this;
        }

        public Criteria andIsUsingIsNull() {
            addCriterion("IS_USING is null");
            return (Criteria) this;
        }

        public Criteria andIsUsingIsNotNull() {
            addCriterion("IS_USING is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsingEqualTo(Boolean value) {
            addCriterion("IS_USING =", value, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingNotEqualTo(Boolean value) {
            addCriterion("IS_USING <>", value, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingGreaterThan(Boolean value) {
            addCriterion("IS_USING >", value, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_USING >=", value, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingLessThan(Boolean value) {
            addCriterion("IS_USING <", value, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_USING <=", value, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingIn(List<Boolean> values) {
            addCriterion("IS_USING in", values, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingNotIn(List<Boolean> values) {
            addCriterion("IS_USING not in", values, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_USING between", value1, value2, "isUsing");
            return (Criteria) this;
        }

        public Criteria andIsUsingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_USING not between", value1, value2, "isUsing");
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

        public Criteria andAreaCostIdLikeInsensitive(String value) {
            addCriterion("upper(AREA_COST_ID) like", value.toUpperCase(), "areaCostId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLikeInsensitive(String value) {
            addCriterion("upper(EXPRESS_ID) like", value.toUpperCase(), "expressId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLikeInsensitive(String value) {
            addCriterion("upper(AREA_ID) like", value.toUpperCase(), "areaId");
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