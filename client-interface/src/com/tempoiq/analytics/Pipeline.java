package com.tempoiq.analytics;

import org.joda.time.Period;

import com.tempoiq.Selector;
import com.tempoiq.analytics.operations.AggregateOperation;
import com.tempoiq.analytics.operations.CombineOperation;
import com.tempoiq.analytics.operations.PipelineOperation;
import com.tempoiq.analytics.operations.Rollup;
import com.tempoiq.analytics.operations.RollupFold;

public class Pipeline {

	public static Pipeline all() {
		return null;
	}
	
	public static Pipeline selectSensor(String sensorKey) {
		return null;
	}
	
	public static Pipeline select(Selector sel) {
		return null;
	}
	

	

	
	public Pipeline rollup(Period period, RollupFold fold) {
		return this.then(new Rollup(period, fold));
	}
	
	public Pipeline exponentialMovingAverage(Period period) {
		return null;
	}
	
	public Pipeline gt(double val) {
		return null;
	}
	
	public Pipeline lt(double val) {
		return null;
	}
	
	public Pipeline inRange(double lower, double upper) {
		return null;
	}
	
	public Pipeline not() {
		return null;
	}
	
	public Pipeline holdTrue(Period p) {
		return null;
	}
	
	/**
	 * General form for applying combine operations
	 * 
	 * @param op
	 * @param join
	 * @param pipes
	 * @return
	 */
	public static Pipeline combine(CombineOperation op, Grouping grp, Pipeline... pipes) {
		return null;
	}
	
	/**
	 * General form for applying basic pipeline operations.
	 * 
	 * @param op
	 * @return
	 */
	public Pipeline then(PipelineOperation op) {
		return null;
	}
	 

	/**
	 * General form for applying aggregation operations
	 * @param op
	 * @param join
	 * @return
	 */
	public Pipeline aggregate(AggregateOperation op, Grouping grp) {
		return null;
	}
	
}