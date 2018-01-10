package edu.zhwei.pojo;

import java.util.ArrayList;
import java.util.List;

public class MenutypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenutypeExample() {
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

        public Criteria andMenuTypeIdIsNull() {
            addCriterion("menu_type_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdIsNotNull() {
            addCriterion("menu_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdEqualTo(Integer value) {
            addCriterion("menu_type_id =", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotEqualTo(Integer value) {
            addCriterion("menu_type_id <>", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdGreaterThan(Integer value) {
            addCriterion("menu_type_id >", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_type_id >=", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdLessThan(Integer value) {
            addCriterion("menu_type_id <", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_type_id <=", value, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdIn(List<Integer> values) {
            addCriterion("menu_type_id in", values, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotIn(List<Integer> values) {
            addCriterion("menu_type_id not in", values, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_type_id between", value1, value2, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_type_id not between", value1, value2, "menuTypeId");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumIsNull() {
            addCriterion("menu_type_num is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumIsNotNull() {
            addCriterion("menu_type_num is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumEqualTo(Integer value) {
            addCriterion("menu_type_num =", value, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumNotEqualTo(Integer value) {
            addCriterion("menu_type_num <>", value, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumGreaterThan(Integer value) {
            addCriterion("menu_type_num >", value, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_type_num >=", value, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumLessThan(Integer value) {
            addCriterion("menu_type_num <", value, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumLessThanOrEqualTo(Integer value) {
            addCriterion("menu_type_num <=", value, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumIn(List<Integer> values) {
            addCriterion("menu_type_num in", values, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumNotIn(List<Integer> values) {
            addCriterion("menu_type_num not in", values, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumBetween(Integer value1, Integer value2) {
            addCriterion("menu_type_num between", value1, value2, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_type_num not between", value1, value2, "menuTypeNum");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameIsNull() {
            addCriterion("menu_type_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameIsNotNull() {
            addCriterion("menu_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameEqualTo(String value) {
            addCriterion("menu_type_name =", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameNotEqualTo(String value) {
            addCriterion("menu_type_name <>", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameGreaterThan(String value) {
            addCriterion("menu_type_name >", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type_name >=", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameLessThan(String value) {
            addCriterion("menu_type_name <", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameLessThanOrEqualTo(String value) {
            addCriterion("menu_type_name <=", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameLike(String value) {
            addCriterion("menu_type_name like", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameNotLike(String value) {
            addCriterion("menu_type_name not like", value, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameIn(List<String> values) {
            addCriterion("menu_type_name in", values, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameNotIn(List<String> values) {
            addCriterion("menu_type_name not in", values, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameBetween(String value1, String value2) {
            addCriterion("menu_type_name between", value1, value2, "menuTypeName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNameNotBetween(String value1, String value2) {
            addCriterion("menu_type_name not between", value1, value2, "menuTypeName");
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