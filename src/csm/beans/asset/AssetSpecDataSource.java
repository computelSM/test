package csm.beans.asset;

import psdi.util.MXException;
import psdi.util.logging.MXLogger;
import psdi.util.logging.MXLoggerFactory;
import psdi.webclient.system.beans.DataBean;

import java.rmi.RemoteException;

/**
 * Created by AMilko on 14.03.2017.
 */
public class AssetSpecDataSource extends DataBean {


    MXLogger custLogger = MXLoggerFactory.getLogger("maximo.custClass01");

    @Override
    protected void initialize() throws MXException, RemoteException {
        custLogger.debug("testing");
        custLogger.debug("testing2");

        super.initialize();
        this.getMboSet().setUserWhere("section='1'");
    }
}
