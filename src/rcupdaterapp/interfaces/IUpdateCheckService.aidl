package rcupdaterapp.interfaces;
import rcupdaterapp.interfaces.IUpdateCheckServiceCallback;

interface IUpdateCheckService
{    
    void checkForUpdates();
    void registerCallback(in IUpdateCheckServiceCallback cb);
    void unregisterCallback(in IUpdateCheckServiceCallback cb);
}