package com.java.api.examples.demo.mapper;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public final class ModelMapperUtil {

	public static synchronized <T, S> List<T> mapList(Collection<S> source, Class<T> targetClass) {

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return source.stream().map(elemnt -> modelMapper.map(elemnt, targetClass)).collect(Collectors.toList());

	}
}
