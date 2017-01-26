package org.neo4j.nlp.impl.util;

import com.google.gson.Gson;
import org.neo4j.cypher.internal.javacompat.ExecutionEngine;
import org.neo4j.cypher.internal.javacompat.ExecutionResult;
import org.neo4j.cypher.javacompat.internal.GraphDatabaseCypherService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.kernel.GraphDatabaseQueryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Copyright (C) 2014 Kenny Bastani
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
* in compliance with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software distributed under the License
* is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
* or implied. See the License for the specific language governing permissions and limitations under
* the License.
*/
@Deprecated
class CypherUtil {

    public static String executeCypher(GraphDatabaseService db, String cypher, Map<String, Object> params) {
        ExecutionEngine engine;
        GraphDatabaseQueryService dbquery = new GraphDatabaseCypherService(db);
        engine = new ExecutionEngine(dbquery, null);

        List<Map<String, Object>> results = new ArrayList<>();

        ExecutionResult result;
//        try ( Transaction tx = db.beginTx() ) {
//            result = engine.execute(cypher, params);
//            for (Map<String,Object> row : result) {
//                results.add(new LinkedHashMap<>(row));
//            }
//            tx.success();
//        }

        return new Gson().toJson(results);
    }
}
