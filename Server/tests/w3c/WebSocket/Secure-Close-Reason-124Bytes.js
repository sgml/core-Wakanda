﻿        var test = async_test("W3C WebSocket API - Create Secure WebSocket - Close the Connection - close(code, 'reason more than 123 bytes') - SYNTAX_ERR is thrown");

        var wsocket = CreateWebSocket(true, false, false);
        var isOpenCalled = false;

        wsocket.addEventListener('open', test.step_func(function (evt) {
            var reason = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123";
            assert_throws("SYNTAX_ERR", function () { wsocket.close(1000, reason) });
            clearTimeout(timeOut);
            test.done();
        }), true);