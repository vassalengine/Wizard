 
package loginWizardDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Map;

/**
 * Fake connection used in this wizard demo for testing on systems without a datbase.
 * 
 * @author sknutson
 */
public class FakeConnection implements Connection
{

    public void clearWarnings() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void close() throws SQLException
    {
        // no action on close, since we weren't really open        
    }

    public void commit() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public Statement createStatement() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public boolean getAutoCommit() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
    }

    public String getCatalog() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public int getHoldability() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
    }

    public DatabaseMetaData getMetaData() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public int getTransactionIsolation() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
    }

    public Map getTypeMap() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public SQLWarning getWarnings() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public boolean isClosed() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
    }

    public boolean isReadOnly() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
    }

    public String nativeSQL(String sql) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public CallableStatement prepareCall(String sql) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void rollback() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void rollback(Savepoint savepoint) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void setCatalog(String catalog) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void setHoldability(int holdability) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void setReadOnly(boolean readOnly) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public Savepoint setSavepoint() throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public Savepoint setSavepoint(String name) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
    }

    public void setTransactionIsolation(int level) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

    public void setTypeMap(Map map) throws SQLException
    {
        throw new RuntimeException ("Fake driver for testing only");
        
    }

}
