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

package com.chiralbehaviors.protoj.controller;

import com.chiralbehaviors.protoj.model.Facet;
import com.chiralbehaviors.protoj.model.WorkspaceResource;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author hhildebrand
 *
 */
public class WorkspaceController {

    private WorkspaceResource     workspace;
    private ObservableList<Facet> facets = FXCollections.observableArrayList();

    public WorkspaceResource getWorkspace() {
        return workspace;
    }

    public void setWorkspace(WorkspaceResource workspace) {
        this.workspace = workspace;
    }

}
