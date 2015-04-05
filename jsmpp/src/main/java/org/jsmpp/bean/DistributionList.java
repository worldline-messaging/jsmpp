/*
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.jsmpp.bean;


/**
 * @author uudashr
 *
 */
public class DistributionList implements DestinationAddress {
    private final String name;

    public DistributionList(String name) {
        this.name = name;
    }
    
    public Flag getFlag() {
        return Flag.DISTRIBUTION_LIST;
    }
    
    public String getName() {
        return name;
    }
}