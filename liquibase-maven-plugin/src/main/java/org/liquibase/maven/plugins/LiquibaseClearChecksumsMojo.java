package org.liquibase.maven.plugins;

import liquibase.Liquibase;
import liquibase.exception.LiquibaseException;

/**
 * <p>Clears all checksums in the current changelog, so they will be recalculated next update.</p>
 * 
 * @author Nathan Voxland
 * @goal clearCheckSums
 */
public class LiquibaseClearChecksumsMojo extends AbstractLiquibaseMojo {

    @Override
    protected void performLiquibaseTask(Liquibase liquibase) throws LiquibaseException {
        liquibase.clearCheckSums();
    }
}
