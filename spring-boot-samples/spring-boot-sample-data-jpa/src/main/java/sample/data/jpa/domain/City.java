/*
 * Copyright 2012-2017 the original author or authors.
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

package sample.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class City extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String state;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private String map;

	protected City()
	{
	}

	public City(String name, String country)
	{
		this.name = name;
		this.country = country;
	}

	public String getName()
	{
		return this.name;
	}

	public String getState()
	{
		return this.state;
	}

	public String getCountry()
	{
		return this.country;
	}

	public String getMap()
	{
		return this.map;
	}

	@Override
	public String toString()
	{
		return getName() + "," + getState() + "," + getCountry();
	}
}
