function chkMsgLength(intMax, objMsg, st) {
	var length = lengthMsg(objMsg.value);
	st.innerHTML = length;// 현재 byte수를 넣는다
	if (length > intMax) {
		alert("최대 " + intMax + "byte이므로 초과된 글자수는 자동으로 삭제됩니다.n");
		objMsg.value = objMsg.value.replace(/rn$/, "");
		objMsg.value = assertMsg(intMax, objMsg.value, st);
	}
}

function lengthMsg(objMsg) {
	var nbytes = 0;
	for (i = 0; i < objMsg.length; i++) {
		var ch = objMsg.charAt(i);
		if (escape(ch).length > 4) {
			nbytes += 2;
		} else if (ch == 'n') {
			if (objMsg.charAt(i - 1) != 'r') {
				nbytes += 1;
			}
		} else if (ch == '<' || ch == '>') {
			nbytes += 4;
		} else {
			nbytes += 1;
		}
	}
	return nbytes;
}

function assertMsg(intMax, objMsg, st) {
	var inc = 0;
	var nbytes = 0;
	var msg = "";

	var msglen = objMsg.length;
	for (i = 0; i < msglen; i++) {
		var ch = objMsg.charAt(i);
		if (escape(ch).length > 4) {
			inc = 2;
		} else if (ch == 'n') {
			if (objMsg.charAt(i - 1) != 'r') {
				inc = 1;
			}
		} else if (ch == '<' || ch == '>') {
			inc = 4;
		} else {
			inc = 1;
		}
		if ((nbytes + inc) > intMax) {
			break;
		}
		nbytes += inc;
		msg += ch;
	}
	st.innerHTML = nbytes; // 현재 byte수를 넣는다
	return msg;
}