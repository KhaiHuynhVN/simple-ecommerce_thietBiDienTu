package com.dustincode.ecommerce.user.entity;

import com.dustincode.ecommerce.user.entity.enumerations.TokenChannel;
import com.dustincode.ecommerce.user.entity.enumerations.TokenType;
import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.Instant;

@StaticMetamodel(UserToken.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class UserToken_ extends com.dustincode.ecommerce.core.audit.AbstractAuditingEntity_ {

	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken#expireTime
	 **/
	public static volatile SingularAttribute<UserToken, Instant> expireTime;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken#channel
	 **/
	public static volatile SingularAttribute<UserToken, TokenChannel> channel;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken#id
	 **/
	public static volatile SingularAttribute<UserToken, Long> id;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken#type
	 **/
	public static volatile SingularAttribute<UserToken, TokenType> type;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken
	 **/
	public static volatile EntityType<UserToken> class_;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken#user
	 **/
	public static volatile SingularAttribute<UserToken, User> user;
	
	/**
	 * @see com.dustincode.ecommerce.user.entity.UserToken#token
	 **/
	public static volatile SingularAttribute<UserToken, String> token;

	public static final String EXPIRE_TIME = "expireTime";
	public static final String CHANNEL = "channel";
	public static final String ID = "id";
	public static final String TYPE = "type";
	public static final String USER = "user";
	public static final String TOKEN = "token";

}

