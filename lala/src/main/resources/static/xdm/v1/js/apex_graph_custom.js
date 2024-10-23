document.addEventListener('DOMContentLoaded', function() {
    //민원
    const complaintCounts = [];
    const complaintList = document.querySelectorAll('.complaint_type h3');

    complaintList.forEach(function(h3) {
        complaintCounts.push(parseInt(h3.textContent, 10));
    });
    console.log("complaintCounts:", complaintCounts);

    // 퍼센트 변환
    const totalComplaints = complaintCounts.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
    const complaintPercentages = complaintCounts.map(count => ((count / totalComplaints) * 100).toFixed(2));
    console.log("complaintPercentages:", complaintPercentages);


    //qna
    const qnaCounts = [];
    const qnaList = document.querySelectorAll('.qna_type h3');

    qnaList.forEach(function(h3) {
        qnaCounts.push(parseInt(h3.textContent, 10));
    });
    console.log("qnaCounts:", qnaCounts);

    // 퍼센트 변환
    const totalQnAs = qnaCounts.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
    const qnaPercentages = qnaCounts.map(count => ((count / totalQnAs) * 100).toFixed(2));
    console.log("qnaPercentages:", qnaPercentages);

    


    var options1 = {
        chart: {
            height: 350,
            type: 'radialBar',
            toolbar: {
                show: false,
            },
        },
        title: {
            text: "※민원",
        },
        plotOptions: {
            radialBar: {
                dataLabels: {
                    name: {
                        fontSize: '12px',
                        fontColor: 'black',
                fontFamily: 'Merriweather',
                    },
                    value: {
                        fontSize: '21px',
                        fontFamily: 'Merriweather',
                    },
                    total: {
                        show: true,
                        label: '민원 종류',
                        formatter: function (w) {
                            console.log("총합:"+totalQnAs)
                            return totalComplaints+"건"; // 총합 반환
                        }
                    }
                }
            }
        },
        series: complaintPercentages,
        labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
        colors: ['#4267cd', '#32b2fa', '#f87957', '#8e44ad', '#2e8b57'],
    }
    
    var options2 = {
        chart: {
            height: 350,
            type: 'radialBar',
            toolbar: {
                show: false,
            },
        },
        title: {
            text: "※QnA",
        },
        plotOptions: {
            radialBar: {
                dataLabels: {
                    name: {
                        fontSize: '12px',
                        fontColor: 'black',
                fontFamily: 'Merriweather',
                    },
                    value: {
                        fontSize: '21px',
                        fontFamily: 'Merriweather',
                    },
                    total: {
                        show: true,
                        label: 'QnA 종류',
                        formatter: function (w) {
                            console.log("총합:"+totalQnAs)
                            return totalQnAs+"건"; // 총합 반환
                        }
                    }
                }
            }
        },
        series: qnaPercentages,
        labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
        colors: ['#4267cd', '#32b2fa', '#f87957', '#8e44ad', '#2e8b57'],
    }
    var options3 = {
                chart: {
                    width: 400,
                    type: 'pie',
                },
                title: {
                    text: "※QnA",
                },
                series: qnaCounts,
                labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
                theme: {
                    monochrome: {
                        enabled: true,
                        color: '#435EEF',
                    }
                },
                // title: {
                // 	text: "Weekly Sales",
                // },
                responsive: [{
                    breakpoint: 480,
                    options: {
                        chart: {
                            width: 200
                        },
                        legend: {
                            position: 'bottom'
                        }
                    }
                }],
                stroke: {
                    width: 0,
                },
            }
    var chart1 = new ApexCharts(
        document.querySelector("#complaint_graph"),
        options1
    );
    var chart2 = new ApexCharts(
        document.querySelector("#qna_graph"),
        options3
    );
    // var chart3 = new ApexCharts(
    //     document.querySelector("#qna_graph"),
    //     options3
    // );



    
    // chart1.render();
    chart1.render();
    chart2.render();
    
});

//index 페이지 Tasks
// var options = {
// 	chart: {
// 		height: 300,
// 		type: 'radialBar',
// 		toolbar: {
// 			show: false,
// 		},
// 	},
// 	plotOptions: {
// 		radialBar: {
// 			dataLabels: {
// 				name: {
// 					fontSize: '12px',
// 					fontColor: 'black',
//           fontFamily: 'Merriweather',
// 				},
// 				value: {
// 					fontSize: '21px',
// 					fontFamily: 'Merriweather',
// 				},
// 				total: {
// 					show: true,
// 					label: 'Tasks',
// 					formatter: function (w) {
// 						// By default this function returns the average of all series. The below is just an example to show the use of custom formatter function
// 						return '19'
// 					}
// 				}
// 			}
// 		}
// 	},
// 	series: [80, 70, 10],
// 	labels: ['New', 'Completed', 'Pending'],
// 	colors: ['#4267cd', '#32b2fa', '#f87957'],
// }
// var options1 = {
//         chart: {
//             width: 400,
//             type: 'pie',
//         },
//         series: [25, 15, 44, 55, 58],
//         labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
//         theme: {
//             monochrome: {
//                 enabled: true,
//                 color: '#435EEF',
//             }
//         },
//         // title: {
//         // 	text: "Weekly Sales",
//         // },
//         responsive: [{
//             breakpoint: 480,
//             options: {
//                 chart: {
//                     width: 200
//                 },
//                 legend: {
//                     position: 'bottom'
//                 }
//             }
//         }],
//         stroke: {
//             width: 0,
//         },
//     }
// var options2 = {
// 	chart: {
// 		width: 400,
// 		type: 'pie',
// 	},
// 	series: [0, 0, 0],
// 	labels: ["접수중", "처리중", "처리완료"],
// 	theme: {
// 		monochrome: {
// 			enabled: true,
// 			color: '#435EEF',
// 		}
// 	},
// colors: ['#6c757d', '#007bff', '#28a745'],
// 	// title: {
// 	// 	text: "Weekly Sales",
// 	// },
// 	responsive: [{
// 		breakpoint: 480,
// 		options: {
// 			chart: {
// 				width: 200
// 			},
// 			legend: {
// 				position: 'bottom'
// 			}
// 		}
// 	}],
// 	stroke: {
// 		width: 0,
// 	},
// }

// var chart = new ApexCharts(
// 	document.querySelector("#taskGraph"),
// 	options
// );
// chart.render();
