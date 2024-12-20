
window.addEventListener('load', function() {
    const form = document.querySelector("form");
    var formUrl;
    if(form){
        formUrl = form.action;
    }
    

    //밸리데이션 변수
    const codeNullText = "코드이름을 적어주세요.";
    const codeRegExpText = "이름은 한글, 영대소문자, 숫자만 입력해 주세요";
    const inputNullText = "내용을 적어주세요.";
    const selectNullText = "내용을 선택해주세요.";
    const alphaNumRegExpText = "영대소문자, 숫자만 입력해 주세요";
    const numNullText = "순서를 적어주세요.";
    const numRegExpText = "정수형 숫자만 입력해 주세요";
    const userId = document.getElementById("userId");
    const userPassword = document.getElementById("userPassword");
    var feedbackText = [];
    const feedbackList = document.querySelectorAll(".invalid-feedback");
    feedbackList.forEach(element => {
        feedbackText.push(element.textContent.trim());
    });

    //정규식
    var idRegExp = /^[a-zA-Z0-9]{5,15}$/;
    var passwordRegExp = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
    var krAlphaNumRegExp = /^[ㄱ-ㅎ가-힣A-Za-z0-9\s]+$/;
    var krNameRegExp = /^[가-힣]{2,4}$/;
    var alphaNumRegExp = /^[a-zA-Z0-9]+$/;
    var numericRegExp = /^[0-9]+$/;
    var emailRegExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
    var birthRegExp =  /^(19[0-9][0-9]|20\d{2})-(0[0-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
    var phoneRegExp = /^01([0|1|6|7|8|9])([0-9]{3,4})([0-9]{4})$/;
    
    const loginBtn = document.querySelector("#loginBtn");
    if(loginBtn){
        loginBtn.addEventListener("click", function() {
            // const loginBoxParent = element.closest('.login-box');
            
            const feedbackChk = document.querySelector(".invalid-child");
            const feedback = document.querySelector(".invalid-feedback");
            
            let idValid = true;
            let pwValid = true;
            let idValue = userId.value.trim();
            let PasswordValue = userPassword.value.trim();
    
            // 아이디 필드 체크
            if (idValue == "" || idValue == null) {
                feedback.textContent = "아이디를 입력해 주세요.";
                userId.classList.add('is-invalid');
                feedbackChk.classList.add('is-invalid');
                idValid = false;
            } else {
                
                if(!idRegExp.test(idValue)){
                    userId.classList.add('is-invalid');
                    userPassword.classList.add('is-invalid');
                    feedbackChk.classList.add('is-invalid');
                    feedback.textContent = "아이디 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.";
                    idValid = false; 
                    return false;
                }else{
                    userId.classList.remove('is-invalid');
                    feedbackChk.classList.remove('is-invalid');
                    // userId.classList.add('is-valid');
                }
                
            }
    
            // 비밀번호 필드 체크
            if (PasswordValue == "" || PasswordValue == null) {
                feedback.textContent = "비밀번호를 입력해 주세요.";
                userPassword.classList.add('is-invalid');
                feedbackChk.classList.add('is-invalid');
                pwValid = false;
            } else {
                
                // if(!passwordRegExp.test(PasswordValue)){
                //     userId.classList.add('is-invalid');
                //     userPassword.classList.add('is-invalid');
                //     feedback.textContent = "아이디 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.";
                //     pwValid = false;
                //     return false;
                // }else{
                //     userPassword.classList.remove('is-invalid');
                //     userPassword.classList.add('is-valid');
                // }
                userPassword.classList.remove('is-invalid');
                feedbackChk.classList.remove('is-invalid');
                // userPassword.classList.add('is-valid');
            }
    
            // 아이디와 비밀번호 모두 입력하지 않은 경우 처리
            if (!idValid && !pwValid) {
                feedback.textContent = "아이디와 비밀번호를 입력해 주세요.";
            }
    
            // 둘 다 중에 하나라도 유효하지 않으면 submit 방지
            if (!idValid || !pwValid) {
                feedbackChk.classList.add('is-invalid');
                return false;
            }
    
            feedback.textContent = "";
    
            //ajax 로그인
            $.ajax({
				async : true, 
				cache : false, 
				type : "post", 
				url : "/v1/infra/loginProc", 
				data : {
					"sfId" : $("#userId").val()
					,"sfPasswd" : $("#userPassword").val() 
					,"autoLogin" : $("#rememberPassword").is(":checked")
				},
				success : function(response) {
					if (response.rt === "success") {
						console.log("로그인 성공");
						location.href = "/v1/dashboard";
					} else {
						$("#modalAlertTitle").text("다시 확인해주세요");
						$("#modalAlertBody").text(
								"ID / 비밀번호를 잘못 입력하셨거나 등록되지 않은 계정입니다.");
						$("#modalAlert").modal("show");
					}
				},
				error : function(jqXHR, textStatus, errorThrown) {
					console.error("AJAX 요청 오류:", textStatus, errorThrown); 
				}
			});

        })
    }
    if(document.querySelector(".login-container form")){
        document.querySelector(".login-container form").addEventListener("keydown", function(event) {
            // const loginBoxParent = element.closest('.login-box');
            if (event.key === "Enter") {
                const feedbackChk = document.querySelector(".invalid-child");
                const feedback = document.querySelector(".invalid-feedback");
                
                let idValid = true;
                let pwValid = true;
                let idValue = userId.value.trim();
                let PasswordValue = userPassword.value.trim();
        
                // 아이디 필드 체크
                if (idValue == "" || idValue == null) {
                    feedback.textContent = "아이디를 입력해 주세요.";
                    userId.classList.add('is-invalid');
                    feedbackChk.classList.add('is-invalid');
                    idValid = false;
                } else {
                    
                    if(!idRegExp.test(idValue)){
                        userId.classList.add('is-invalid');
                        userPassword.classList.add('is-invalid');
                        feedbackChk.classList.add('is-invalid');
                        feedback.textContent = "아이디 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.";
                        idValid = false; 
                        return false;
                    }else{
                        userId.classList.remove('is-invalid');
                        feedbackChk.classList.remove('is-invalid');
                        // userId.classList.add('is-valid');
                    }
                    
                }
        
                // 비밀번호 필드 체크
                if (PasswordValue == "" || PasswordValue == null) {
                    feedback.textContent = "비밀번호를 입력해 주세요.";
                    userPassword.classList.add('is-invalid');
                    feedbackChk.classList.add('is-invalid');
                    pwValid = false;
                } else {
                    
                    if(!passwordRegExp.test(PasswordValue)){
                        userId.classList.add('is-invalid');
                        userPassword.classList.add('is-invalid');
                        feedback.textContent = "아이디 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.";
                        pwValid = false;
                        return false;
                    }else{
                        userPassword.classList.remove('is-invalid');
                        userPassword.classList.add('is-valid');
                    }
                    userPassword.classList.remove('is-invalid');
                    feedbackChk.classList.remove('is-invalid');
                    // userPassword.classList.add('is-valid');
                }
        
                // 아이디와 비밀번호 모두 입력하지 않은 경우 처리
                if (!idValid && !pwValid) {
                    feedback.textContent = "아이디와 비밀번호를 입력해 주세요.";
                }
        
                // 둘 다 중에 하나라도 유효하지 않으면 submit 방지
                if (!idValid || !pwValid) {
                    feedbackChk.classList.add('is-invalid');
                    return false;
                }
        
                feedback.textContent = "";
        
                //ajax 로그인
                $.ajax({
                    async : true, 
                    cache : false, 
                    type : "post", 
                    url : "/v1/infra/loginProc", 
                    data : {
                        "sfId" : $("#userId").val()
                        ,"sfPasswd" : $("#userPassword").val() 
                        ,"autoLogin" : $("#rememberPassword").is(":checked")
                    },
                    success : function(response) {
                        if (response.rt === "success") {
                            console.log("로그인 성공");
                            location.href = "/v1/dashboard";
                        } else {
                            $("#modalAlertTitle").text("다시 확인해주세요");
                            $("#modalAlertBody").text(
                                    "ID / 비밀번호를 잘못 입력하셨거나 등록되지 않은 계정입니다.");
                            $("#modalAlert").modal("show");
                        }
                    },
                    error : function(jqXHR, textStatus, errorThrown) {
                        console.error("AJAX 요청 오류:", textStatus, errorThrown); 
                    }
                });
            }
        })
    }
    
    

    //데이터삭제 js
    
    // var form = document.querySelector("form");
    if(document.getElementById("ueleteBtn")||document.getElementById("deleteBtn")){
        var currentAction = form.action;
        var newAction = currentAction.slice(0, -4);
        function del() {
            form.action = newAction + 'Delt';	
            form.submit();
        }
        function uel() {
            form.action = newAction + 'Uelt';
            form.submit();
        }
        document.getElementById("deleteBtn").onclick = del;
        document.getElementById("ueleteBtn").onclick = uel;
    }
    

    //밸리데이션
    // const codeNullText = "코드이름을 적어주세요.";
    // const codeRegExpText = "이름은 한글, 영대소문자, 숫자만 입력해 주세요";
    // const inputNullText = "내용을 적어주세요.";
    // const selectNullText = "내용을 선택해주세요.";
    // const alphaNumRegExpText = "영대소문자, 숫자만 입력해 주세요";
    // const numNullText = "순서를 적어주세요.";
    // const numRegExpText = "정수형 숫자만 입력해 주세요";
    // var feedbackText = [];
    // const feedbackList = document.querySelectorAll(".invalid-feedback");
    // feedbackList.forEach(element => {
    //     feedbackText.push(element.textContent.trim());
    // });
    console.log(feedbackText);
    
    //제출버튼
    const btnSubmit = document.getElementById("btnSubmit");
    if (btnSubmit) {
        btnSubmit.onclick = function (){
            
            var objs = document.querySelectorAll(".validate-this");
            var i= 0;
            var validateChk = false;
            for(let element of objs){
                console.log("element:",element);
                var objValue = element.value.trim();
                const feedback = element.parentElement.querySelector(".invalid-feedback");
                if (objValue == "" || objValue == null) {
                    // var waring = feedback.textContent.trim();
                    if(element.tagName ==='INPUT'){
                        console.log("테스트:",inputNullText);
                        console.log("feedback:"+feedback);
                        feedback.textContent = inputNullText;
                        // alert(inputNullText);
                    }else if(element.tagName ==='SELECT'){
                        feedback.textContent = selectNullText;
                        // alert(selectNullText);
                    }
                    
                    
                    if(i==0){
                        element.focus();
                    }
                    i++;
                    validateChk = false;
                    element.classList.add('is-invalid');
                } else {
                    //by pass
                    var val  = RegExps(element,objValue,feedback);
                    console.log("체크");
                    if(val == true){
                        validateChk = true;
                        element.classList.remove('is-invalid');
                        element.classList.add('is-valid');
                    }else{
                        // feedback.textContent = codeRegExpText;
                        if(i==0){
                            element.focus();
                        }
                        i++;
                        validateChk = false;
                        element.classList.add('is-invalid');
                    }
                    
                }
            };
            if(validateChk == false){
                alert("검사실패");
                return false;
            }
            // alert("통과!");
            form.action = formUrl;
            form.submit();

        }
    }

    //xdm로그아웃
    const logoutBtn = document.getElementById("logoutBtn");
    console.log("logoutBtn: "+logoutBtn);
    if (logoutBtn) {
        logoutBtn.onclick = function (){
            //ajax 로그아웃
           
            $.ajax({
                async : true, 
                cache : false, 
                type : "post", 
                url : "/v1/infra/logoutProc", 
                success : function(response) {
                    if (response.rt === "success") { 
                        location.href = response.redirectUrl; 
                    } else {
                        alert("로그아웃 실패: " + response.message);
                    }
                },
                error : function(jqXHR, textStatus, errorThrown) {
                    console.error("AJAX Error: " + textStatus + " - "
                                    + errorThrown);
                }
            });
        }
    }
    
    
    function RegExps(element,objValue,feedback) {
        console.log("태그: "+element.id);
        console.log("클래스: "+element.classList);
        // const loginBoxParent = element.closest('.login-box');
        // if (loginBoxParent) {
        //     if (element.classList.contains('valid-id')) {
        //         console.log("아이디형식");
        //         // var idRegExp = /^[a-zA-Z0-9]{5,15}$/;
        //         if(!idRegExp.test(objValue)){
        //             var text = "아이디는 5~15자의 영대소문자와 숫자만 포함해야 합니다.";
        //             //alert(text);
        //             feedback.textContent = text;
        //             element.focus();
        //             return false;
        //         } else {
        // // 	    	by pass
        //             return true;
        //         }
                
        //     }
        //     else if (element.classList.contains('valid-password')) {
        //         console.log("비밀번호형식");
        //         // var passwordRegExp = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
        //         if(!passwordRegExp.test(objValue)){
        //             var text = "비밀번호는 8~15자 사이여야 하며, 최소 1개의 숫자, 영문자, 특수문자를 포함해야 합니다.";
        //             //alert(text);
        //             feedback.textContent = text;
        //             element.focus();
        //             return false;
        //         } else {
        // // 	    	by pass
        //             return true;
        //         }
        //     }
        //     console.log("검사끝");
        // }else{
            if (element.classList.contains('valid-korean-alpha-num')) {
                console.log("특문빼고");
                
                if(!krAlphaNumRegExp.test(objValue)){
                    // alert(codeRegExpText);
                    feedback.textContent = codeRegExpText;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    // //alert("정규식 통과");
                    return true;
                }
            } else if (element.classList.contains('valid-alpha-num')) {
                console.log("한글빼고");
                
                if(!alphaNumRegExp.test(objValue)){
                    alert(alphaNumRegExpText);
                    feedback.textContent = alphaNumRegExpText;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    //alert("정규식 통과");
                    return true;
                }
            } else if (element.classList.contains('valid-numeric')) {
                console.log("숫자만");
                
                if(!numericRegExp.test(objValue)){
                    alert(numRegExpText);
                    feedback.textContent = numRegExpText;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    //alert("정규식 통과");
                    return true;
                }
            }
            else if (element.classList.contains('valid-email')) {
                console.log("이메일만");
                
                //정규식
                //https://choijying21.tistory.com/entry/%EC%9E%90%EB%B0%94%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8-%EC%9E%90%EC%A3%BC-%EC%93%B0%EB%8A%94-%EC%A0%95%EA%B7%9C%EC%8B%9D-%EB%AA%A8%EC%9D%8C-%EC%9D%B4%EB%A9%94%EC%9D%BC-%ED%95%B8%EB%93%9C%ED%8F%B0-%EC%A3%BC%EB%AF%BC%EB%B2%88%ED%98%B8-%EB%93%B1
    
                if(!emailRegExp.test(objValue)){
                    var text = "이메일 형식에 따라 정확히 입력해주세요";
                    //alert(text);
                    feedback.textContent = text;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    //alert("정규식 통과");
                    return true;
                }
            } else if (element.classList.contains('valid-birth-num')) {
                console.log("생년월일만");
                
    //출처: https://choijying21.tistory.com/entry/자바스크립트-자주-쓰는-정규식-모음-이메일-핸드폰-주민번호-등 [JDevelog:티스토리]
                console.log("생일: "+objValue);
                if(!birthRegExp.test(objValue)){
                    var text = "정확한 생년월일 8자리를 입력해주세요";
                    //alert(text);
                    feedback.textContent = text;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    //alert("정규식 통과");
                    return true;
                }
            }
            else if (element.classList.contains('valid-id')) {
                console.log("아이디형식");
                if(!idRegExp.test(objValue)){
                    var text = "아이디는 5~15자의 영대소문자와 숫자만 포함해야 합니다.";
                    //alert(text);
                    feedback.textContent = text;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    //alert("정규식 통과");
                    return true;
                }
            }else if (element.classList.contains('valid-user-name')) {
                console.log("한글만");
                
                if(!krNameRegExp.test(objValue)){
                    var text = "최소 2자 이상, 최대 4자의 한글만 입력해주세요";
                    feedback.textContent = text;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    return true;
                }
            }
        //     else if (element.classList.contains('valid-password')) {
        //         console.log("비밀번호형식");

        //         if(!passwordRegExp.test(objValue)){
        //             var text = "비밀번호는 8~15자 사이여야 하며, 최소 1개의 숫자, 영문자, 특수문자를 포함해야 합니다.";
        //             //alert(text);
        //             feedback.textContent = text;
        //             element.focus();
        //             return false;
        //         } else {
        // // 	    	by pass
        //             //alert("정규식 통과");
        //             return true;
        //         }
        //     }
            else if (element.classList.contains('valid-phone-num')) {
                console.log("핸드폰번호 숫자만");
                
                if(!phoneRegExp.test(objValue)){
                    var text = "정확한 핸드폰번호를 입력해주세요: - 제외";
                    //alert(text);
                    feedback.textContent = text;
                    element.focus();
                    return false;
                } else {
        // 	    	by pass
                    //alert("정규식 통과");
                    return true;
                }
            }else{
                console.log("else 통과");
                //alert("else 통과");
                return true;
            }
        // }
        
        
        
    }

    //원본
    // document.getElementById("btnSubmit").onclick = function (){
    //     const form = document.querySelector("form");
    //     const formUrl = form.action;
    //     var objs = document.querySelectorAll(".validate-this");
    //     var i= 0;
    //     var validateChk = false;
    //     for(let element of objs){
    //         var objValue = element.value.trim();
    //         const feedback = element.parentElement.querySelector(".invalid-feedback");
    //         if (objValue == "" || objValue == null) {
                
    //             var waring = feedback.textContent.trim();
    //             feedback.textContent = waring;
    //             alert(waring);
    //             if(i==0){
    //                 element.focus();
    //             }
    //             i++;
    //             validateChk = false;
    //             element.classList.add('is-invalid');
    //         } else {
    //             //by pass
    //             var val  = RegExps(element,objValue,feedback);
    //             if(val == true){
    //                 validateChk = true;
    //                 element.classList.remove('is-invalid');
    //                 element.classList.add('is-valid');
    //             }else{
    //                 // feedback.textContent = codeRegExpText;
    //                 if(i==0){
    //                     element.focus();
    //                 }
    //                 i++;
    //                 validateChk = false;
    //                 element.classList.add('is-invalid');
    //             }
                
    //         }
    //     };
    //     if(validateChk == false){
    //         alert("검사실패");
    //         return false;
    //     }
    //     alert("통과!");
    //     // form.action = formUrl;
    //     // form.submit();
    // }
    
    // function RegExps(element,objValue,feedback) {
    //     if (element.id =="inputCodeName") {
    //         var ifcdNameRegExp = /^[ㄱ-ㅎ가-힣A-Za-z0-9]+$/;
    //         if(!ifcdNameRegExp.test(objValue)){
    //             alert(codeRegExpText);
    //             feedback.textContent = codeRegExpText;
    //             element.focus();
    //             return false;
    //         } else {
    // // 	    	by pass
    //             //alert("정규식 통과");
    //             return true;
    //         }
    //     } else if (element.id =="inputCodeOrder") {
    //         var ifcdOrderRegExp = /^[0-9]+$/;
    //         if(!ifcdOrderRegExp.test(objValue)){
    //             alert(orderNullText);
    //             feedback.textContent = orderNullText;
    //             element.focus();
    //             return false;
    //         } else {
    // // 	    	by pass
    //             //alert("정규식 통과");
    //             return true;
    //         }
    //     }else{
    //         alert("나머지 통과");
    //         return true;
    //     }
    //     else if (element.id =="inputCodeGroup") {
    //         if(!ifcgNameRegExp.test(objValue)){
    //             alert("선택해 주세요");
    //             element.focus();
    //             return false;
    //         } else {
    // // 	    	by pass
    //             //alert("정규식 통과");
    //             return true;
    //         }
    //     }
        
    //}
    const sidebarDropdown = document.querySelectorAll(".sidebar-dropdown > a");

    sidebarDropdown.forEach(function(link) {
        link.addEventListener("contextmenu", function(event) {
            event.preventDefault(); // 오른쪽 클릭 메뉴 방지
            // alert("오른쪽 클릭이 방지되었습니다.");
        });
    });
    document.getElementById('pdfdown').addEventListener('click', function() {
        // PDF 파일 생성 요청을 보낼 URL
        const arSeq = $("#inputArSeq").val(); 
        $.ajax({
            url: "/generate-pdf", // PDF를 생성하는 서버의 엔드포인트
            method: "GET",
            data: {
                arSeq: arSeq // 요청에 필요한 매개변수 전달
            },
            xhrFields: {
                responseType: 'blob' // 응답 타입을 blob으로 설정
            },
            success: function(response) {
                // PDF 파일 다운로드
                var url = window.URL.createObjectURL(response);
                var a = document.createElement('a');
                a.href = url;
                a.download = "민원_후_처리보고서_" + arSeq + ".pdf"; // 파일 이름 설정
                document.body.appendChild(a);
                a.click();
                a.remove();
                window.URL.revokeObjectURL(url); // 메모리 해제
            },
            error: function(xhr, status, error) {
                console.error("PDF 생성 실패:", status, error);
                alert("PDF 생성 중 오류가 발생했습니다.");
            }
        });
        // $.ajax({
        //     async : true, 
        //     cache : false, 
        //     type : "post", 
        //     url : "/generate-pdf", 
        //     data: {arSeq:arSeq},
        //     success : function(response) {
        //         if (response.rt === "success") { 
        //             location.href = response.redirectUrl; 
        //         } else {
        //             alert("PDF 생성 실패: " + response.message);
        //         }
        //     },
        //     error : function(jqXHR, textStatus, errorThrown) {
        //         console.error("PDF 생성 실패: " + textStatus + " - "
        //                         + errorThrown);
                                
        //     }
        // });
        
    });
});