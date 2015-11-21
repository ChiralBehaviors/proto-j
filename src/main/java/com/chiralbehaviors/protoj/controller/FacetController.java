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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FacetController {

    @FXML
    private TextField         name;

    @FXML
    private ChoiceBox<?>      classifier;

    @FXML
    private ChoiceBox<?>      classification;

    @FXML
    private TableView<?>      facetAttributes;

    @FXML
    private TableColumn<?, ?> attribute;

    @FXML
    private TableColumn<?, ?> defaultValue;

    @FXML
    private TableView<?>      networkAttributes;

    @FXML
    private TableView<?>      facetChildren;

    @FXML
    private TableColumn<?, ?> cardinality;

    @FXML
    private TableColumn<?, ?> child;

    @FXML
    private TableColumn<?, ?> relationship;

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void refresh(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void setName(ActionEvent event) {

    }

}
