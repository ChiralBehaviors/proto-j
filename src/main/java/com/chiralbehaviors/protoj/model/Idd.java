/**
 * Copyright (c) 2015 Chiral Behaviors, LLC, all rights reserved.
 * 
 
 * This file is part of Ultrastructure.
 *
 *  Ultrastructure is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  ULtrastructure is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with Ultrastructure.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.chiralbehaviors.protoj.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;

/**
 * A thing with an ID
 * 
 * @author hhildebrand
 *
 */
public abstract class Idd {
    private ObservableStringValue id = new SimpleStringProperty();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.get()
                                                        .hashCode());
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
        if (!(obj instanceof Idd)) {
            return false;
        }
        Idd other = (Idd) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.get()
                      .equals(other.id.get())) {
            return false;
        }
        return true;
    }
}
