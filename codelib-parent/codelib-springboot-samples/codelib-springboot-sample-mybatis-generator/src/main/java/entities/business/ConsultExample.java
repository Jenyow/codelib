package entities.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsultExample() {
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

        public Criteria andConsultIdIsNull() {
            addCriterion("CONSULT_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsultIdIsNotNull() {
            addCriterion("CONSULT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsultIdEqualTo(Integer value) {
            addCriterion("CONSULT_ID =", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotEqualTo(Integer value) {
            addCriterion("CONSULT_ID <>", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdGreaterThan(Integer value) {
            addCriterion("CONSULT_ID >", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSULT_ID >=", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdLessThan(Integer value) {
            addCriterion("CONSULT_ID <", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdLessThanOrEqualTo(Integer value) {
            addCriterion("CONSULT_ID <=", value, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdIn(List<Integer> values) {
            addCriterion("CONSULT_ID in", values, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotIn(List<Integer> values) {
            addCriterion("CONSULT_ID not in", values, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdBetween(Integer value1, Integer value2) {
            addCriterion("CONSULT_ID between", value1, value2, "consultId");
            return (Criteria) this;
        }

        public Criteria andConsultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSULT_ID not between", value1, value2, "consultId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andTitmeIsNull() {
            addCriterion("TITME is null");
            return (Criteria) this;
        }

        public Criteria andTitmeIsNotNull() {
            addCriterion("TITME is not null");
            return (Criteria) this;
        }

        public Criteria andTitmeEqualTo(String value) {
            addCriterion("TITME =", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeNotEqualTo(String value) {
            addCriterion("TITME <>", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeGreaterThan(String value) {
            addCriterion("TITME >", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeGreaterThanOrEqualTo(String value) {
            addCriterion("TITME >=", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeLessThan(String value) {
            addCriterion("TITME <", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeLessThanOrEqualTo(String value) {
            addCriterion("TITME <=", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeLike(String value) {
            addCriterion("TITME like", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeNotLike(String value) {
            addCriterion("TITME not like", value, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeIn(List<String> values) {
            addCriterion("TITME in", values, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeNotIn(List<String> values) {
            addCriterion("TITME not in", values, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeBetween(String value1, String value2) {
            addCriterion("TITME between", value1, value2, "titme");
            return (Criteria) this;
        }

        public Criteria andTitmeNotBetween(String value1, String value2) {
            addCriterion("TITME not between", value1, value2, "titme");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIsNull() {
            addCriterion("CONSULT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIsNotNull() {
            addCriterion("CONSULT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andConsultTimeEqualTo(Date value) {
            addCriterion("CONSULT_TIME =", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotEqualTo(Date value) {
            addCriterion("CONSULT_TIME <>", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeGreaterThan(Date value) {
            addCriterion("CONSULT_TIME >", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONSULT_TIME >=", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeLessThan(Date value) {
            addCriterion("CONSULT_TIME <", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeLessThanOrEqualTo(Date value) {
            addCriterion("CONSULT_TIME <=", value, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeIn(List<Date> values) {
            addCriterion("CONSULT_TIME in", values, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotIn(List<Date> values) {
            addCriterion("CONSULT_TIME not in", values, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeBetween(Date value1, Date value2) {
            addCriterion("CONSULT_TIME between", value1, value2, "consultTime");
            return (Criteria) this;
        }

        public Criteria andConsultTimeNotBetween(Date value1, Date value2) {
            addCriterion("CONSULT_TIME not between", value1, value2, "consultTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("LAST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("LAST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("LAST_TIME =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("LAST_TIME <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("LAST_TIME >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("LAST_TIME <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_TIME <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("LAST_TIME in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("LAST_TIME not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_TIME not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andConsulterIsNull() {
            addCriterion("CONSULTER is null");
            return (Criteria) this;
        }

        public Criteria andConsulterIsNotNull() {
            addCriterion("CONSULTER is not null");
            return (Criteria) this;
        }

        public Criteria andConsulterEqualTo(String value) {
            addCriterion("CONSULTER =", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterNotEqualTo(String value) {
            addCriterion("CONSULTER <>", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterGreaterThan(String value) {
            addCriterion("CONSULTER >", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTER >=", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterLessThan(String value) {
            addCriterion("CONSULTER <", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterLessThanOrEqualTo(String value) {
            addCriterion("CONSULTER <=", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterLike(String value) {
            addCriterion("CONSULTER like", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterNotLike(String value) {
            addCriterion("CONSULTER not like", value, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterIn(List<String> values) {
            addCriterion("CONSULTER in", values, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterNotIn(List<String> values) {
            addCriterion("CONSULTER not in", values, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterBetween(String value1, String value2) {
            addCriterion("CONSULTER between", value1, value2, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterNotBetween(String value1, String value2) {
            addCriterion("CONSULTER not between", value1, value2, "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterIdIsNull() {
            addCriterion("CONSULTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andConsulterIdIsNotNull() {
            addCriterion("CONSULTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConsulterIdEqualTo(String value) {
            addCriterion("CONSULTER_ID =", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdNotEqualTo(String value) {
            addCriterion("CONSULTER_ID <>", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdGreaterThan(String value) {
            addCriterion("CONSULTER_ID >", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTER_ID >=", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdLessThan(String value) {
            addCriterion("CONSULTER_ID <", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdLessThanOrEqualTo(String value) {
            addCriterion("CONSULTER_ID <=", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdLike(String value) {
            addCriterion("CONSULTER_ID like", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdNotLike(String value) {
            addCriterion("CONSULTER_ID not like", value, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdIn(List<String> values) {
            addCriterion("CONSULTER_ID in", values, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdNotIn(List<String> values) {
            addCriterion("CONSULTER_ID not in", values, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdBetween(String value1, String value2) {
            addCriterion("CONSULTER_ID between", value1, value2, "consulterId");
            return (Criteria) this;
        }

        public Criteria andConsulterIdNotBetween(String value1, String value2) {
            addCriterion("CONSULTER_ID not between", value1, value2, "consulterId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIsNull() {
            addCriterion("WORK_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIsNotNull() {
            addCriterion("WORK_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTitleEqualTo(String value) {
            addCriterion("WORK_TITLE =", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotEqualTo(String value) {
            addCriterion("WORK_TITLE <>", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleGreaterThan(String value) {
            addCriterion("WORK_TITLE >", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TITLE >=", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLessThan(String value) {
            addCriterion("WORK_TITLE <", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLessThanOrEqualTo(String value) {
            addCriterion("WORK_TITLE <=", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLike(String value) {
            addCriterion("WORK_TITLE like", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotLike(String value) {
            addCriterion("WORK_TITLE not like", value, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleIn(List<String> values) {
            addCriterion("WORK_TITLE in", values, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotIn(List<String> values) {
            addCriterion("WORK_TITLE not in", values, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleBetween(String value1, String value2) {
            addCriterion("WORK_TITLE between", value1, value2, "workTitle");
            return (Criteria) this;
        }

        public Criteria andWorkTitleNotBetween(String value1, String value2) {
            addCriterion("WORK_TITLE not between", value1, value2, "workTitle");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andConsultTypeIsNull() {
            addCriterion("CONSULT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConsultTypeIsNotNull() {
            addCriterion("CONSULT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConsultTypeEqualTo(Short value) {
            addCriterion("CONSULT_TYPE =", value, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeNotEqualTo(Short value) {
            addCriterion("CONSULT_TYPE <>", value, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeGreaterThan(Short value) {
            addCriterion("CONSULT_TYPE >", value, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CONSULT_TYPE >=", value, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeLessThan(Short value) {
            addCriterion("CONSULT_TYPE <", value, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeLessThanOrEqualTo(Short value) {
            addCriterion("CONSULT_TYPE <=", value, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeIn(List<Short> values) {
            addCriterion("CONSULT_TYPE in", values, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeNotIn(List<Short> values) {
            addCriterion("CONSULT_TYPE not in", values, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeBetween(Short value1, Short value2) {
            addCriterion("CONSULT_TYPE between", value1, value2, "consultType");
            return (Criteria) this;
        }

        public Criteria andConsultTypeNotBetween(Short value1, Short value2) {
            addCriterion("CONSULT_TYPE not between", value1, value2, "consultType");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNull() {
            addCriterion("ROOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("ROOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRootIdEqualTo(Integer value) {
            addCriterion("ROOT_ID =", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotEqualTo(Integer value) {
            addCriterion("ROOT_ID <>", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThan(Integer value) {
            addCriterion("ROOT_ID >", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOT_ID >=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThan(Integer value) {
            addCriterion("ROOT_ID <", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROOT_ID <=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdIn(List<Integer> values) {
            addCriterion("ROOT_ID in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotIn(List<Integer> values) {
            addCriterion("ROOT_ID not in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdBetween(Integer value1, Integer value2) {
            addCriterion("ROOT_ID between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOT_ID not between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andConsultUuidIsNull() {
            addCriterion("CONSULT_UUID is null");
            return (Criteria) this;
        }

        public Criteria andConsultUuidIsNotNull() {
            addCriterion("CONSULT_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andConsultUuidEqualTo(String value) {
            addCriterion("CONSULT_UUID =", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidNotEqualTo(String value) {
            addCriterion("CONSULT_UUID <>", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidGreaterThan(String value) {
            addCriterion("CONSULT_UUID >", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULT_UUID >=", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidLessThan(String value) {
            addCriterion("CONSULT_UUID <", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidLessThanOrEqualTo(String value) {
            addCriterion("CONSULT_UUID <=", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidLike(String value) {
            addCriterion("CONSULT_UUID like", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidNotLike(String value) {
            addCriterion("CONSULT_UUID not like", value, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidIn(List<String> values) {
            addCriterion("CONSULT_UUID in", values, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidNotIn(List<String> values) {
            addCriterion("CONSULT_UUID not in", values, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidBetween(String value1, String value2) {
            addCriterion("CONSULT_UUID between", value1, value2, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andConsultUuidNotBetween(String value1, String value2) {
            addCriterion("CONSULT_UUID not between", value1, value2, "consultUuid");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
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

        public Criteria andTitmeLikeInsensitive(String value) {
            addCriterion("upper(TITME) like", value.toUpperCase(), "titme");
            return (Criteria) this;
        }

        public Criteria andConsulterLikeInsensitive(String value) {
            addCriterion("upper(CONSULTER) like", value.toUpperCase(), "consulter");
            return (Criteria) this;
        }

        public Criteria andConsulterIdLikeInsensitive(String value) {
            addCriterion("upper(CONSULTER_ID) like", value.toUpperCase(), "consulterId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(COMPANY_NAME) like", value.toUpperCase(), "companyName");
            return (Criteria) this;
        }

        public Criteria andWorkTitleLikeInsensitive(String value) {
            addCriterion("upper(WORK_TITLE) like", value.toUpperCase(), "workTitle");
            return (Criteria) this;
        }

        public Criteria andConsultUuidLikeInsensitive(String value) {
            addCriterion("upper(CONSULT_UUID) like", value.toUpperCase(), "consultUuid");
            return (Criteria) this;
        }

        public Criteria andCategoryLikeInsensitive(String value) {
            addCriterion("upper(CATEGORY) like", value.toUpperCase(), "category");
            return (Criteria) this;
        }

        public Criteria andMemoLikeInsensitive(String value) {
            addCriterion("upper(MEMO) like", value.toUpperCase(), "memo");
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