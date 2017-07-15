package com.natek.algorithm;

import com.natek.domain.Instrument;

public interface StatisticAlgorithm {
	public void compute(Instrument item, AlgorithmExecutor ex);
}
