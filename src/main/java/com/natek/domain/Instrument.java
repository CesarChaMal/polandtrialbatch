/*
 * Copyright 2006-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.natek.domain;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class Instrument implements Serializable {
	
	private String INSTRUMENT_NAME;
	private String date;
	private Double value;
	public String getINSTRUMENT_NAME() {
		return INSTRUMENT_NAME;
	}
	public void setINSTRUMENT_NAME(String iNSTRUMENT_NAME) {
		INSTRUMENT_NAME = iNSTRUMENT_NAME;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {

		return " Instrument: NAME= " + INSTRUMENT_NAME + " date : " + date + " value : " + value ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((INSTRUMENT_NAME == null) ? 0 : INSTRUMENT_NAME.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Instrument other = (Instrument) obj;
		if (INSTRUMENT_NAME == null) {
			if (other.INSTRUMENT_NAME != null) {
				return false;
			}
		}
		else if (!INSTRUMENT_NAME.equals(other.INSTRUMENT_NAME)) {
			return false;
		}

		return true;
	}
	public Instrument executeAlgorithm(BigDecimal fixedAmount) {
		// TODO Auto-generated method stub
		return this;
	}
		
}
