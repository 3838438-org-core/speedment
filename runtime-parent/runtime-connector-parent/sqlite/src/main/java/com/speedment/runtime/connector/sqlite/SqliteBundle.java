package com.speedment.runtime.connector.sqlite;

import com.speedment.common.injector.InjectBundle;
import com.speedment.runtime.connector.sqlite.internal.SqliteComponentImpl;
import com.speedment.runtime.connector.sqlite.internal.SqliteDbmsType;
import com.speedment.runtime.connector.sqlite.internal.SqliteMetadataHandler;
import com.speedment.runtime.connector.sqlite.internal.SqliteOperationHandler;

import java.util.stream.Stream;

/**
 * The main bundle for adding runtime support for the SQLite database manager.
 *
 * @author Emil Forslund
 * @since  3.1.10
 */
public class SqliteBundle implements InjectBundle {

    @Override
    public Stream<Class<?>> injectables() {
        return Stream.of(
            SqliteComponentImpl.class,
            SqliteMetadataHandler.class,
            SqliteOperationHandler.class,
            SqliteDbmsType.class
        );
    }
}
