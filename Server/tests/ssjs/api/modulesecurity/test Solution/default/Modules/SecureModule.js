﻿/*	In order to make the helloWorld() function available client-side, you have to add a reference to the 'SecureModule' module in the GUI Designer.
	The helloWorld() function can be executed from your JS file as follows:
	alert(SecureModule.helloWorld());
	
	For more information, refer to http://doc.wakanda.org/Wakanda0.Beta/help/Title/en/page1516.html
*/
exports.defaultAccess = function defaultAccess (inFirst, inLast) {
	return inFirst + " " +inLast;
};
