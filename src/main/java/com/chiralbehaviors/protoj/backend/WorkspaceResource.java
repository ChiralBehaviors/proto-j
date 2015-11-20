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

package com.chiralbehaviors.protoj.backend;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * @author hhildebrand
 *
 */
public class WorkspaceResource {
    private WebTarget webTarget;

    public WorkspaceResource(Client client,
                             String workspaceURI) throws UnsupportedEncodingException {
        webTarget = client.target("http://localhost:%s/graphql/workspace");
        webTarget = webTarget.path(URLEncoder.encode(workspaceURI, "UTF-8"));
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> invoke(QueryRequest request) {
        return (Map<String, Object>) webTarget.request()
                                              .post(Entity.entity(request,
                                                                  MediaType.APPLICATION_JSON_TYPE))
                                              .readEntity(Map.class);
    }
}
