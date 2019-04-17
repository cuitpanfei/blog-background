package com.my.blog.website.modal.Vo;

import com.my.blog.website.modal.BaseVoExample;
import com.my.blog.website.modal.GeneratedCriteria;

import java.util.List;

public class ContentVoExample extends BaseVoExample<ContentVoExample.Criteria> {

    @Override
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return this;
        }

        public Criteria andSlugIsNull() {
            addCriterion("slug is null");
            return this;
        }

        public Criteria andSlugIsNotNull() {
            addCriterion("slug is not null");
            return this;
        }

        public Criteria andSlugEqualTo(String value) {
            addCriterion("slug =", value, "slug");
            return this;
        }

        public Criteria andSlugNotEqualTo(String value) {
            addCriterion("slug <>", value, "slug");
            return this;
        }

        public Criteria andSlugGreaterThan(String value) {
            addCriterion("slug >", value, "slug");
            return this;
        }

        public Criteria andSlugGreaterThanOrEqualTo(String value) {
            addCriterion("slug >=", value, "slug");
            return this;
        }

        public Criteria andSlugLessThan(String value) {
            addCriterion("slug <", value, "slug");
            return this;
        }

        public Criteria andSlugLessThanOrEqualTo(String value) {
            addCriterion("slug <=", value, "slug");
            return this;
        }

        public Criteria andSlugLike(String value) {
            addCriterion("slug like", value, "slug");
            return this;
        }

        public Criteria andSlugNotLike(String value) {
            addCriterion("slug not like", value, "slug");
            return this;
        }

        public Criteria andSlugIn(List<String> values) {
            addCriterion("slug in", values, "slug");
            return this;
        }

        public Criteria andSlugNotIn(List<String> values) {
            addCriterion("slug not in", values, "slug");
            return this;
        }

        public Criteria andSlugBetween(String value1, String value2) {
            addCriterion("slug between", value1, value2, "slug");
            return this;
        }

        public Criteria andSlugNotBetween(String value1, String value2) {
            addCriterion("slug not between", value1, value2, "slug");
            return this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return this;
        }

        public Criteria andCreatedEqualTo(Integer value) {
            addCriterion("created =", value, "created");
            return this;
        }

        public Criteria andCreatedNotEqualTo(Integer value) {
            addCriterion("created <>", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThan(Integer value) {
            addCriterion("created >", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("created >=", value, "created");
            return this;
        }

        public Criteria andCreatedLessThan(Integer value) {
            addCriterion("created <", value, "created");
            return this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Integer value) {
            addCriterion("created <=", value, "created");
            return this;
        }

        public Criteria andCreatedIn(List<Integer> values) {
            addCriterion("created in", values, "created");
            return this;
        }

        public Criteria andCreatedNotIn(List<Integer> values) {
            addCriterion("created not in", values, "created");
            return this;
        }

        public Criteria andCreatedBetween(Integer value1, Integer value2) {
            addCriterion("created between", value1, value2, "created");
            return this;
        }

        public Criteria andCreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("created not between", value1, value2, "created");
            return this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return this;
        }

        public Criteria andModifiedEqualTo(Integer value) {
            addCriterion("modified =", value, "modified");
            return this;
        }

        public Criteria andModifiedNotEqualTo(Integer value) {
            addCriterion("modified <>", value, "modified");
            return this;
        }

        public Criteria andModifiedGreaterThan(Integer value) {
            addCriterion("modified >", value, "modified");
            return this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("modified >=", value, "modified");
            return this;
        }

        public Criteria andModifiedLessThan(Integer value) {
            addCriterion("modified <", value, "modified");
            return this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Integer value) {
            addCriterion("modified <=", value, "modified");
            return this;
        }

        public Criteria andModifiedIn(List<Integer> values) {
            addCriterion("modified in", values, "modified");
            return this;
        }

        public Criteria andModifiedNotIn(List<Integer> values) {
            addCriterion("modified not in", values, "modified");
            return this;
        }

        public Criteria andModifiedBetween(Integer value1, Integer value2) {
            addCriterion("modified between", value1, value2, "modified");
            return this;
        }

        public Criteria andModifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return this;
        }

        public Criteria andCategoriesIsNull() {
            addCriterion("categories is null");
            return this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("categories is not null");
            return this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("categories =", value, "categories");
            return this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("categories <>", value, "categories");
            return this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("categories >", value, "categories");
            return this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("categories >=", value, "categories");
            return this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("categories <", value, "categories");
            return this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("categories <=", value, "categories");
            return this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("categories like", value, "categories");
            return this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("categories not like", value, "categories");
            return this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("categories in", values, "categories");
            return this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("categories not in", values, "categories");
            return this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("categories between", value1, value2, "categories");
            return this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("categories not between", value1, value2, "categories");
            return this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return this;
        }

        public Criteria andCommentsNumIsNull() {
            addCriterion("comments_num is null");
            return this;
        }

        public Criteria andCommentsNumIsNotNull() {
            addCriterion("comments_num is not null");
            return this;
        }

        public Criteria andCommentsNumEqualTo(Integer value) {
            addCriterion("comments_num =", value, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumNotEqualTo(Integer value) {
            addCriterion("comments_num <>", value, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumGreaterThan(Integer value) {
            addCriterion("comments_num >", value, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_num >=", value, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumLessThan(Integer value) {
            addCriterion("comments_num <", value, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumLessThanOrEqualTo(Integer value) {
            addCriterion("comments_num <=", value, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumIn(List<Integer> values) {
            addCriterion("comments_num in", values, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumNotIn(List<Integer> values) {
            addCriterion("comments_num not in", values, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumBetween(Integer value1, Integer value2) {
            addCriterion("comments_num between", value1, value2, "commentsNum");
            return this;
        }

        public Criteria andCommentsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_num not between", value1, value2, "commentsNum");
            return this;
        }

        public Criteria andAllowCommentIsNull() {
            addCriterion("allow_comment is null");
            return this;
        }

        public Criteria andAllowCommentIsNotNull() {
            addCriterion("allow_comment is not null");
            return this;
        }

        public Criteria andAllowCommentEqualTo(Boolean value) {
            addCriterion("allow_comment =", value, "allowComment");
            return this;
        }

        public Criteria andAllowCommentNotEqualTo(Boolean value) {
            addCriterion("allow_comment <>", value, "allowComment");
            return this;
        }

        public Criteria andAllowCommentGreaterThan(Boolean value) {
            addCriterion("allow_comment >", value, "allowComment");
            return this;
        }

        public Criteria andAllowCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_comment >=", value, "allowComment");
            return this;
        }

        public Criteria andAllowCommentLessThan(Boolean value) {
            addCriterion("allow_comment <", value, "allowComment");
            return this;
        }

        public Criteria andAllowCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_comment <=", value, "allowComment");
            return this;
        }

        public Criteria andAllowCommentIn(List<Boolean> values) {
            addCriterion("allow_comment in", values, "allowComment");
            return this;
        }

        public Criteria andAllowCommentNotIn(List<Boolean> values) {
            addCriterion("allow_comment not in", values, "allowComment");
            return this;
        }

        public Criteria andAllowCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_comment between", value1, value2, "allowComment");
            return this;
        }

        public Criteria andAllowCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_comment not between", value1, value2, "allowComment");
            return this;
        }

        public Criteria andAllowPingIsNull() {
            addCriterion("allow_ping is null");
            return this;
        }

        public Criteria andAllowPingIsNotNull() {
            addCriterion("allow_ping is not null");
            return this;
        }

        public Criteria andAllowPingEqualTo(Boolean value) {
            addCriterion("allow_ping =", value, "allowPing");
            return this;
        }

        public Criteria andAllowPingNotEqualTo(Boolean value) {
            addCriterion("allow_ping <>", value, "allowPing");
            return this;
        }

        public Criteria andAllowPingGreaterThan(Boolean value) {
            addCriterion("allow_ping >", value, "allowPing");
            return this;
        }

        public Criteria andAllowPingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_ping >=", value, "allowPing");
            return this;
        }

        public Criteria andAllowPingLessThan(Boolean value) {
            addCriterion("allow_ping <", value, "allowPing");
            return this;
        }

        public Criteria andAllowPingLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_ping <=", value, "allowPing");
            return this;
        }

        public Criteria andAllowPingIn(List<Boolean> values) {
            addCriterion("allow_ping in", values, "allowPing");
            return this;
        }

        public Criteria andAllowPingNotIn(List<Boolean> values) {
            addCriterion("allow_ping not in", values, "allowPing");
            return this;
        }

        public Criteria andAllowPingBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_ping between", value1, value2, "allowPing");
            return this;
        }

        public Criteria andAllowPingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_ping not between", value1, value2, "allowPing");
            return this;
        }

        public Criteria andAllowFeedIsNull() {
            addCriterion("allow_feed is null");
            return this;
        }

        public Criteria andAllowFeedIsNotNull() {
            addCriterion("allow_feed is not null");
            return this;
        }

        public Criteria andAllowFeedEqualTo(Boolean value) {
            addCriterion("allow_feed =", value, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedNotEqualTo(Boolean value) {
            addCriterion("allow_feed <>", value, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedGreaterThan(Boolean value) {
            addCriterion("allow_feed >", value, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("allow_feed >=", value, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedLessThan(Boolean value) {
            addCriterion("allow_feed <", value, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedLessThanOrEqualTo(Boolean value) {
            addCriterion("allow_feed <=", value, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedIn(List<Boolean> values) {
            addCriterion("allow_feed in", values, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedNotIn(List<Boolean> values) {
            addCriterion("allow_feed not in", values, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_feed between", value1, value2, "allowFeed");
            return this;
        }

        public Criteria andAllowFeedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("allow_feed not between", value1, value2, "allowFeed");
            return this;
        }
    }

}