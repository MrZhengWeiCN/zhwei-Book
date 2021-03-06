package edu.zhwei.search.component.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.JedisCluster;

import edu.zhwei.search.component.JedisClient;

public class JedisClientCluster implements JedisClient {

	@Autowired
	private JedisCluster jedisCluster;

	@Override
	public String set(String key, String value) {
		return jedisCluster.set(key, value);
	}

	@Override
	public String get(String key) {
		return jedisCluster.get(key);
	}

	@Override
	public Long hset(String key, String item, String value) {
		return jedisCluster.hset(key, item, value);
	}

	@Override
	public String hget(String key, String item) {
		return jedisCluster.hget(key, item);
	}

	@Override
	public Long incr(String key) {
		return jedisCluster.incr(key);
	}

	@Override
	public Long decr(String key) {
		return jedisCluster.decr(key);
	}

	@Override
	public Long expire(String key, int second) {
		return jedisCluster.expire(key, second);
	}

	@Override
	public Long hdel(String key, String value) {
		return jedisCluster.hdel(key, value);
	}

	@Override
	public Long del(String string) {
		return jedisCluster.del(string);
	}

	@Override
	public Long zAdd(String key, int score, String member) {
		return jedisCluster.zadd(key, score, member);
	}

	@Override
	public Double zIncryBy(String key, int increment, String member) {
		return jedisCluster.zincrby(key, increment, member);
	}

	@Override
	public Set<String> zRevRange(String key, int start, int stop) {
		return jedisCluster.zrevrange(key, start, stop);
	}

}
