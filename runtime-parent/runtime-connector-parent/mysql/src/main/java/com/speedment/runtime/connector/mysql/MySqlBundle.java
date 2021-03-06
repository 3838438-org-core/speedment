/**
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.connector.mysql;

import com.speedment.common.injector.InjectBundle;
import com.speedment.runtime.connector.mysql.internal.MySqlComponentImpl;
import com.speedment.runtime.connector.mysql.internal.MySqlDbmsMetadataHandler;
import com.speedment.runtime.connector.mysql.internal.MySqlDbmsOperationHandler;
import com.speedment.runtime.connector.mysql.internal.MySqlDbmsType;
import com.speedment.runtime.connector.mysql.internal.MySqlSpeedmentPredicateView;
import java.util.stream.Stream;

/**
 *
 * @author Per Minborg
 * @since 3.0.0
 */
public class MySqlBundle implements InjectBundle {

    @Override
    public Stream<Class<?>> injectables() {
        return Stream.of(
            MySqlComponentImpl.class,
            MySqlDbmsType.class,
            MySqlDbmsMetadataHandler.class,
            MySqlDbmsOperationHandler.class,
            MySqlSpeedmentPredicateView.class
        );
    }
}
