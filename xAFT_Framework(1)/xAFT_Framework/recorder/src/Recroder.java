import com.thoughtworks.frankenstein.application.FrankensteinIntegration;


public class Recroder 
{
	 public static void main(String[] args) throws InterruptedException
	 {
		 args=new String[]{"GUI.Init.UIRegistry=//fc8fguim01:15000/WebGUIFramework",
				    "GUI.Init.EventRegistry=//fc8fguim01:15004/EventManager",
				    "GUI.Init.EventHostList=fc8fguim01",
				    "GUI.Init.UIInterval=15000",
				    "GUI.Init.Zone=fabgui",
				    "GUI.Init.CodeBase=http://fc8fguim01:8088/",
				    "GUI.Init.LanguageFile=http://fc8fguim01:8088/lang/",
				    "GUI.Param.EMSC.EnableErfWaferAllocationChangeOnlyNoSubmit=Yes",
				    "GUI.Param.EMSC.RestrictedLotCount=PB|PC|PD|PF|PG|Pn|PN|PO|PR|PX|PZ|SL|EG|EP|MW|QD|QE|QF|QX|RM|RQ|RS|EB|EC|EM|E0|EQ|ES|ET|RD|RV|TW",
				    "GUI.Param.EMSC.CheckWaferSetting=Yes",
				    "GUI.Param.SS.spectype=ERF",
				    "GUI.Param.EMSC.SubLotType_QUAL=EG|EP|MW|QD|QE|QF|QX|RM|RQ|RS",
				    "GUI.Param.EMSC.UserRolesAllCheckLists=REQUESTOR|ERF_ADMIN",
				    "GUI.Param.SS.HelpFile=http://fc8fguim01:8088/ems/UserGuideIQSys/SpecSys_UserGuide.html",
				    "GUI.Param.SS.XDiffService=http://fc8xmldg01:11001/dxmlservice/dxml",
				    "GUI.Param.EFSA.SubLotType_DEV=EB|EC|EM|E0|EQ|ES|ET|RD|RV|TW",
				    "GUI.Param.DBCC.HelpFile=",
				    "GUI.Param.SSC.XDiffFilterChainOut=ExtractAttributes.xsl,DeltaXML.xsl,DeltaXMLDIVFilter.xsl",
				    "GUI.Param.SS.SpecSystemRegistry=//fc8fguim01:15011/SpecSysERFServer",
				    "GUI.Param.EMSC.QTime.Edit.UseMainFlowQTimes=Yes",
				    "GUI.Param.EMSC.EnableErfDynamicBranch=Yes",
				    "GUI.Param.EFSA.Autosetup.Validation.PhotoLayer.OptionalModules=LIT|*",
				    "GUI.Param.EFSA.UserRolesERSRecipe=REQUESTOR|ERF_ADMIN",
				    "GUI.Param.EFSA.XDiffSpecCondErrMsg_1=XMLDiff can be performed only at spec revisions submitted since EMS 3.1.0",
				    "GUI.Param.SSC.ShowApprovalsOf=yes",
				    "GUI.Param.EMSC.MandadoryWaferShippingCategories=EMSC.SubLotType_PROD|EMSC.SubLotType_QUAL|EMSC.SubLotType_LEGACY",
				    "GUI.Param.EMSC.EnableErfResubmitAfterCancel=Yes",
				    "GUI.Param.EMSC.SubLotType_TQUL=",
				    "GUI.Param.EFSA.ErfSpec.Validation.ShipDelay.SubLotTypes=",
				    "GUI.Param.DBCC.TABLESEDITBASICDATA=",
				    "GUI.Param.EFSA.WF.Task.SetupExecute.SetupDone.State=APPROVED",
				    "GUI.Param.EFSA.Autosetup.Validation.PhotoLayer.MandatoryModules=",
				    "GUI.Param.SCPA.IgnoreList=Eqp-Pull;Eqp-Push",
				    "GUI.Param.EFSA.WF.Task.CleanupCancel.CleanupDone.State=CLEANUP DONE",
				    "GUI.Param.SplashImage=http://fc8fguim01:8088/fabgui_splash.jpg",
				    "GUI.Param.SS.XDiffFilterLocation=/customapps/ems/EMS.14.1.1.6/zones/ems/webapps/ems/WEB-INF/stylesheets_erfspec_html/",
				    "GUI.Param.EFSA.XDiffFilterLocation=/customapps/ems/EMS.14.1.1.6/zones/ems/webapps/ems/WEB-INF/stylesheets_erfspec_html/",
				    "GUI.Param.EFSA.RestrictedLotCountTolerance=2",
				    "GUI.Param.EMSC.QTime.ReasonCodes=QMRB|QSCR|QRW2|QDSP|NQRV|QRW4",
				    "GUI.Param.EMSC.GenerateRecipeNameSpace=No",
				    "GUI.Param.EFSA.QTime.Actions=DispatchPrecede|Mail|FutureRework|ImmediateHold|FutureHold",
				    "GUI.Param.EFSA.QTime.Edit.UseMainFlowQTimes=Yes",
				    "GUI.Param.EMSC.Autosetup.Validation.CarrierCategory.DummySkip=no",
				    "GUI.Param.SSC.XDiffSpecCondition_1=count(//ChildSpecs/Spec[ translate(@SOFTWAREVERSION,'.','')  >= 310] ) = count(//ChildSpecs/Spec)",
				    "GUI.Param.EFSA.GUI.ErfList.MaxRecs=500",
				    "GUI.Param.CallMode=WebStart",
				    "GUI.Param.XF.EnableOddCalculation=1",
				    "GUI.Param.EFSA.EnableContaminationCheck=Yes",
				    "GUI.Param.EMSC.SubLotType_PROD=PB|PC|PD|PF|PG|Pn|PN|PO|PR|PX|PZ|SL",
				    "GUI.Param.EMSC.Location.CsvSave=u:ems",
				    "GUI.Param.EFSA.EnableErfResubmitAfterCancel=Yes",
				    "GUI.Param.DBCC.CheckRightUser=EFSA.Right.Edit",
				    "GUI.Param.EFSA.EnableRMSCheck=Yes",
				    "GUI.Param.Display=TM06-191",
				    "GUI.Param.SS.XDiffFilterChainOut=ExtractAttributes.xsl,DeltaXML.xsl,DeltaXMLDIVFilter.xsl",
				    "GUI.Param.EFSA.XDiffFilterChainOut=ExtractAttributes.xsl,DeltaXML.xsl,DeltaXMLDIVFilter.xsl",
				    "GUI.Param.SS.XDiffSpecCondition_1=count(//ChildSpecs/Spec[ translate(@SOFTWAREVERSION,'.','')  >= 310] ) = count(//ChildSpecs/Spec)",
				    "GUI.Param.EFSA.MasterData.Enabled=QueueTime|ContaminationControl|CarrierCategory|PhotoLayer",
				    "GUI.Param.SS.StyleSheetDiff=/customapps/ems/EMS.14.1.1.6/zones/ems/webapps/ems/WEB-INF/stylesheets_erfspec_text",
				    "GUI.Param.Username=sbehera1",
				    "GUI.Param.EMSC.Registry=//fc8fguim01:15013/ErfSaServer",
				    "GUI.Param.EFSA.Registry=//fc8fguim01:15011/ErfSaServer",
				    "GUI.Param.Type=GUI.Dialog.Default",
				    "GUI.Param.EFSA.WF.Task.CleanupTerminate.CleanupDone.State=TERMINATION DONE",
				    "GUI.Param.EMSC.EnableContaminationCheck=Yes",
				    "GUI.Param.DebugMode=N",
				    "GUI.Param.EFSA.XDiffService=http://fc8xmldg01:11001/dxmlservice/dxml",
				    "GUI.Param.EFSA.ErfSpec.Validation.ShipDelay.MaxDays=0",
				    "GUI.Param.DBCF.HelpFile=",
				    "GUI.Param.EFSA.GUI.Autosetup.Dimension=992,691",
				    "GUI.Param.SSC.HelpFile=http://fc8fguim01:8088/emsclassic/UserGuideIQSys/SpecSys_UserGuide.html",
				    "GUI.Param.Language=en",
				    "GUI.Param.EMSC.Autosetup.Validation.PhotoLayer.OptionalModules=LIT|*",
				    "GUI.Param.EFSA.LotFamilyRegex=[A-Z0-9-]+\\.(00|000|001)",
				    "GUI.Param.EMSC.EnablePORProcessing=Yes",
				    "GUI.Param.DBCC.Registry=//fc8fguim01:15013/DBConfigServer",
				    "GUI.Param.EMSC.RouteSelection.MainPDTypes=Backup|Branch|Dummy|Engineering|Equipment Monitor|Process Monitor|Production|Recycle|Rework",
				    "GUI.Param.SSC.ShowApprovalsNextHist=yes",
				    "GUI.Param.EFSA.WF.Task.Review.Approve.State=APPROVED",
				    "GUI.Param.EFSA.Location.CsvBackup=",
				    "GUI.Param.EFSA.WF.Task.SetupBuddyCheck.Approve.State=APPROVED",
				    "GUI.Param.SSC.spectype=ERF",
				    "GUI.Param.SS.XDiffSpecCondErrMsg_1=XMLDiff can be performed only at spec revisions submitted since EMS 3.1.0",
				    "GUI.Param.EFSA.PanelAStateClientTypes=edit | com.globalfoundries.erfsa.client.gui.PanelSpecEdit; editModApp | com.globalfoundries.erfsa.client.gui.PanelSpecEdit; setup | com.globalfoundries.erfsa.client.gui.panelsetupprep.PanelSetupPrep",
				    "GUI.Param.EFSA.GUI.Validation.TSG.URL=",
				    "GUI.Param.DBCF.CheckRightUser=EFSA.Right.Edit",
				    "GUI.Param.SS.LogLevel=9",
				    "GUI.Param.EMSC.QTime.MsgIDs=QT-OVER|QTWARN|QTWARN2",
				    "GUI.Param.EFSA.XDiffFilterChainIn=ErfDeltaOrderless_SubSpecs.xsl,ErfDeltaOrderlessSplits.xsl",
				    "GUI.Param.EFSA.SubLotType_QUAL=EG|EP|MW|QD|QE|QF|QX|RM|RQ|RS",
				    "GUI.Param.EMSC.LogLevel=20000",
				    "GUI.Param.EFSA.LogLevel=10000",
				    "GUI.Param.EFSA.EnablePORProcessing=Yes",
				    "GUI.Param.EMSC.SubLotType_SCRAP=SCRAP",
				    "GUI.Param.SSC.XDiffSpecCondErrMsg_1=XMLDiff can be performed only at spec revisions submitted since EMS 3.1.0",
				    "GUI.Param.EFSA.RouteSelection.MainPDTypes=Backup|Branch|Dummy|Engineering|Equipment Monitor|Process Monitor|Production|Recycle|Rework",
				    "GUI.Param.EMSC.PanelAStateClientTypes=edit | com.globalfoundries.erfsaclassic.client.gui.PanelSpecEdit; editModApp | com.globalfoundries.erfsaclassic.client.gui.PanelSpecEdit; setup | com.globalfoundries.erfsaclassic.client.gui.panelsetupprep.PanelSetupPrep",
				    "GUI.Param.EFSA.SubLotType_LEGACY=PZ|MW|CMCL|SMPL|PROD|PROD-PO|PROD-PR|PROD-PX|PQUL|PQUL-MW|PQUL-PX|PQUL-QD|PQUL-QE|PQUL-QF",
				    "GUI.Param.EMSC.GUI.Autosetup.Usage.CarrierCategoryEditable=No",
				    "GUI.Param.EMSC.GUI.Autosetup.Dimension=992,691",
				    "GUI.Param.EFSA.RestrictedLotCount=PB|PC|PD|PF|PG|Pn|PN|PO|PR|PX|PZ|SL|EG|EP|MW|QD|QE|QF|QX|RM|RQ|RS|EB|EC|EM|E0|EQ|ES|ET|RD|RV|TW",
				    "GUI.Param.SS.Adminmode=no",
				    "GUI.Param.SSC.StyleSheetDiff=/customapps/emsclassic/EMS.13.13.0.8/zones/emsclassic/webapps/emsclassic/WEB-INF/stylesheets_erfspec_text",
				    "GUI.Param.DBCC.CheckRight=EFSA.Right.Admin",
				    "GUI.Param.EMSC.GUI.Validation.TSG.URL=",
				    "GUI.Param.SSC.Adminmode=no",
				    "GUI.Param.EMSC.ShowRemainingLotCount=Yes",
				    "GUI.Param.SSC.XDiffFilterChainIn=ErfDeltaOrderless_SubSpecs.xsl,ErfDeltaOrderlessSplits.xsl",
				    "GUI.Param.EFSA.SubLotType_TQUL=",
				    "GUI.Param.EMSC.Autosetup.Validation.PhotoLayer.MandatoryModules=",
				    "GUI.Param.EMSC.EnableRecipeParameterTuning=Yes",
				    "GUI.Param.EMSC.UserRolesERSRecipe=REQUESTOR|ERF_ADMIN",
				    "GUI.Param.EM.ListenerID=WebUI V3.8",
				    "GUI.Param.EMSC.EnableErfTypeEngineeringRemoval=Yes",
				    "GUI.Param.SD.CorbaPort=1055",
				    "GUI.Param.SS.PanelAStateClientTypes=",
				    "GUI.Param.EFSA.XDiffSpecCondition_1=count(//ChildSpecs/Spec[ translate(@SOFTWAREVERSION,'.','')  >= 310] ) = count(//ChildSpecs/Spec)",
				    "GUI.Param.EMSC.ErfSpec.Validation.ShipDelay.SubLotTypes=",
				    "GUI.Param.EFSA.QTime.MsgIDs=QT-OVER|QTWARN|QTWARN2",
				    "GUI.Param.EFSA.StyleSheetDiff=/customapps/ems/EMS.14.1.1.6/zones/ems/webapps/ems/WEB-INF/stylesheets_erfspec_text",
				    "GUI.Param.DBCF.Registry=//fc8fguim01:15011/DBConfigServer",
				    "GUI.Param.EFSA.EnableErfTypeEngineeringRemoval=Yes",
				    "GUI.Param.EFSA.CheckWaferSetting=Yes",
				    "GUI.Param.SSC.PanelAStateClientTypes=",
				    "GUI.Param.EFSA.WF.Task.SetupBuddyCheck.Reject.State=DISAPPROVED",
				    "GUI.Param.SSC.XDiffService=http://fc8xmldg01:11001/dxmlservice/dxml",
				    "GUI.Param.EMSC.QTime.Actions=DispatchPrecede|Mail|FutureRework|ImmediateHold|FutureHold",
				    "GUI.Param.EFSA.SubLotType_PROD=PB|PC|PD|PF|PG|Pn|PN|PO|PR|PX|PZ|SL",
				    "GUI.Param.EMSC.GUI.Autosetup.Usage.ERSAutoLRGeneration=No",
				    "GUI.Param.EFSA.Location.CsvSave=",
				    "GUI.Param.EMSC.ErfSpec.Validation.ShipDelay.MaxDays=0",
				    "GUI.Param.SSC.SpecSystemRegistry=//fc8fguim01:15013/SpecSysERFServer",
				    "GUI.Param.EMSC.SubLotType_DEV=EB|EC|EM|E0|EQ|ES|ET|RD|RV|TW",
				    "GUI.Param.EFSA.Autosetup.Validation.CarrierCategory.DummySkip=no",
				    "GUI.Param.DBCF.Title=DBConfig GUI",
				    "GUI.Param.EMSC.QTime.Criticalities=C1|C2|C4",
				    "GUI.Param.DBCF.CheckRight=EFSA.Right.Admin",
				    "GUI.Param.EFSA.WF.Task.SetupExecute.Reject.State=DISAPPROVED",
				    "GUI.Param.EFSA.MandadoryWaferShippingCategories=EFSA.SubLotType_PROD|EFSA.SubLotType_QUAL|EFSA.SubLotType_LEGACY",
				    "GUI.Param.EMSC.MasterData.Enabled=QueueTime|ContaminationControl|CarrierCategory|PhotoLayer",
				    "GUI.Param.Security=N",
				    "GUI.Param.EFSA.GUI.Autosetup.Usage.CarrierCategoryEditable=No",
				    "GUI.Param.SD.CorbaHost=fc8vamom01",
				    "GUI.Param.EFSA.QTime.ReasonCodes=QMRB|QSCR|QRW2|QDSP|NQRV|QRW4",
				    "GUI.Param.EM.LogLevel=20000",
				    "GUI.Param.EFSA.WF.Task.Review.Reject.State=DISAPPROVED",
				    "GUI.Param.DBCF.TABLESEDITBASICDATA=",
				    "GUI.Param.DBCC.Title=DBConfig GUI",
				    "GUI.Param.EFSA.QTime.Criticalities=C1|C2|C4",
				    "GUI.Param.SSC.LogLevel=9",
				    "GUI.Param.EFSA.WF.Task.ModuleApprove.Reject.State=DISAPPROVED",
				    "GUI.Param.EP.CTX.SublotTypes=E*|M*|P*|Q*|R*",
				    "GUI.Param.EFSA.GUI.Autosetup.Usage.ERSAutoLRGeneration=No",
				    "GUI.Param.EFSA.EnableRecipeParameterTuning=Yes",
				    "GUI.Param.EMSC.SubLotType_LEGACY=PZ|MW|CMCL|SMPL|PROD|PROD-PO|PROD-PR|PROD-PX|PQUL|PQUL-MW|PQUL-PX|PQUL-QD|PQUL-QE|PQUL-QF",
				    "GUI.Param.EMSC.EnableErfAdminReviewAutoApprove=Yes",
				    "GUI.Param.EMSC.RestrictedLotCountTolerance=2",
				    "GUI.Param.LogLevel=20000",
				    "GUI.Param.EMSC.EnableRMSCheck=Yes",
				    "GUI.Param.EMSC.Location.CsvBackup=u:emsbackup",
				    "GUI.Param.EMSC.LotFamilyRegex=[A-Z0-9-]+\\.(00|000|001)",
				    "GUI.Param.SS.XDiffFilterChainIn=ErfDeltaOrderless_SubSpecs.xsl,ErfDeltaOrderlessSplits.xsl",
				    "GUI.Param.EFSA.WF.Task.ModuleApprove.Approve.State=APPROVED",
				    "GUI.Param.EFSA.EnableErfAdminReviewAutoApprove=Yes",
				    "GUI.Param.EMSC.GUI.EMSPLUS.Available=Yes",
				    "GUI.Param.EFSA.SubLotType_SCRAP=SCRAP",
				    "GUI.Param.EFSA.UserRolesAllCheckLists=REQUESTOR|ERF_ADMIN",
				    "GUI.Param.SSC.XDiffFilterLocation=/customapps/emsclassic/EMS.13.13.0.8/zones/emsclassic/webapps/emsclassic/WEB-INF/stylesheets_erfspec_html/",
				    "GUI.Param.EMSC.HelpFile=http://fc8fguim01:8088/emsclassic/UserGuideEMS/Erfsa_UserGuide.html",
				    "GUI.Param.EFSA.HelpFile=http://fc8fguim01:8088/ems/UserGuideEMS/Erfsa_UserGuide.html",
				    "GUI.Param.EFSA.GenerateRecipeNameSpace=No",
				    "GUI.Param.EFSA.EnableErfDynamicBranch=Yes",
				    "GUI.Param.EFSA.ShowRemainingLotCount=Yes"
				    };
		 FrankensteinIntegration driver = new FrankensteinIntegration(com.globalfoundries.fabgui.webgui.application.WebGUIApplication.class);
		 driver.start(args);
		 System.out.println("Frankenstein");
	 }

}