WinWaitActive("Open")
ControlClick("Open","","DirectUIHWND2")
sleep(3000)
ControlClick("Open","","Edit1")
send(selenium)
send("{DOWN}")
sleep(3000)
ControlClick("Open","","Button1")

